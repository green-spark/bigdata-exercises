package tweet;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mrunit.mapreduce.MapDriver;
import org.junit.Test;

import java.io.IOException;


public class TweetCountMapperTest {

    @Test
    public void processesValidRecord() throws IOException, InterruptedException {
        Text value = new Text("20151103,A123,2345"); //date, userid, tweetcount

        new MapDriver<LongWritable, Text, Text, IntWritable>()
                .withMapper(new TweetCountMapper())
                .withInput(new LongWritable(0), value)
                .withOutput(new Text("A123"), new IntWritable(2345))
                .runTest();
    }
}