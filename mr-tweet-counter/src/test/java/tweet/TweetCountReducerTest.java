package tweet;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mrunit.mapreduce.ReduceDriver;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

public class TweetCountReducerTest {

    @Test
    public void returnsMaximumIntegerInValues() throws IOException,
            InterruptedException {
        new ReduceDriver<Text, IntWritable, Text, IntWritable>()
                .withReducer(new TweetCountReducer())
                .withInput(new Text("A324"),
                        Arrays.asList(new IntWritable(10), new IntWritable(5)))
                .withOutput(new Text("A324"), new IntWritable(15))
                .runTest();
    }
}