/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Operator.Gateway.Packets;

import Operator.Gateway.Packet;
import org.jboss.netty.buffer.ChannelBuffer;

/**
 *
 * @author bsalmanov
 */
public class CallUnholdPacket extends Packet {

    @Override
    public Integer getId() {
        return Packet.CALL_UNHOLD;
    }

    @Override
    public void get(ChannelBuffer buffer) {
        
    }

    @Override
    public void send(ChannelBuffer buffer) {
        
    }
    
}
