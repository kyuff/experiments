package dk.kyuff.experiment.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.nio.charset.Charset;
import java.util.List;

/**
 * User: swi
 * Date: 29/08/13
 * Time: 20.52
 */
public class AppDecoder extends ByteToMessageDecoder {

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        String[] input = in.toString(Charset.forName("UTF-8")).split(";");
        String name = input[1];
        int age = Integer.decode(input[0]);
        out.add(new Data(name,age));
        in.release();
    }
}
