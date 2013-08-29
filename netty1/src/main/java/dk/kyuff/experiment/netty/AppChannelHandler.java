package dk.kyuff.experiment.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.nio.charset.Charset;

/**
 * User: swi
 * Date: 28/08/13
 * Time: 17.51
 */
public class AppChannelHandler extends ChannelInboundHandlerAdapter {

    private int count = 0;
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ByteBuf buf = (ByteBuf)msg;
        System.out.println("read: " + buf.toString(Charset.forName("UTF-8")));
        String replyText = "message #" + count++ + "\n";
        ByteBuf reply = Unpooled.wrappedBuffer(replyText.getBytes(Charset.forName("UTF-8")));
        ctx.writeAndFlush(reply);
    }
}
