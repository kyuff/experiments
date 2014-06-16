package dk.kyuff.experiment.netty;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;

/**
 * User: swi
 * Date: 29/08/13
 * Time: 19.58
 */
public class AppChannelHandlerInitializor extends ChannelInitializer<SocketChannel> {

    private int count = 0;

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        System.out.println("Creating channel #" + count++);
        ch.pipeline().addLast(
                new AppDecoder(),
                new AppChannelHandler()
        );
    }
}
