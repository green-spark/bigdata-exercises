package tweet;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;


public class TweetCountReducer  extends Reducer<Text, IntWritable, Text, IntWritable> {

    @Override
    public void reduce(Text key, Iterable<IntWritable> values,  Context context)
            throws IOException, InterruptedException {


       //TODO context.write(key, new IntWritable(count));
    }
}
