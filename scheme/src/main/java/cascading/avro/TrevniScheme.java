package cascading.avro;

import cascading.avro.serialization.AvroSpecificRecordSerialization;
import cascading.flow.FlowProcess;
import cascading.tap.Tap;
import org.apache.avro.Schema;
import org.apache.avro.mapred.AvroJob;
import org.apache.avro.mapred.AvroSerialization;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.RecordReader;
import org.apache.trevni.avro.AvroTrevniInputFormat;
import org.apache.trevni.avro.AvroTrevniOutputFormat;

import java.util.Collection;

public class TrevniScheme extends AvroScheme {

    public TrevniScheme(Schema schema) {
        super(schema);
    }

    @Override
    public void sourceConfInit(FlowProcess<? extends Configuration> flowProcess,
                               Tap<Configuration, RecordReader, OutputCollector> tap, Configuration conf) {

        retrieveSourceFields(flowProcess, tap);

        // Set the input schema and input format class
        conf.set(AvroJob.INPUT_SCHEMA, schema.toString());
        ((JobConf) conf).setInputFormat(AvroTrevniInputFormat.class);

        // add AvroSerialization to io.serializations
        addAvroSerializations(conf);
    }

    @Override
    public void sinkConfInit(FlowProcess<? extends Configuration> flowProcess,
                             Tap<Configuration, RecordReader, OutputCollector> tap, Configuration conf) {

        if (schema == null) {
            throw new RuntimeException("Must provide sink schema");
        }

        // Set the output schema and output format class
        conf.set(AvroJob.OUTPUT_SCHEMA, schema.toString());
        ((JobConf) conf).setOutputFormat(AvroTrevniOutputFormat.class);

        // add AvroSerialization to io.serializations
        addAvroSerializations(conf);
    }


    private void addAvroSerializations(Configuration conf) {
        Collection<String> serializations = conf
                .getStringCollection("io.serializations");
        if (!serializations.contains(AvroSerialization.class.getName())) {
            serializations.add(AvroSerialization.class.getName());
            serializations.add(AvroSpecificRecordSerialization.class.getName());
        }

        conf.setStrings("io.serializations",
                serializations.toArray(new String[serializations.size()]));
    }

}
