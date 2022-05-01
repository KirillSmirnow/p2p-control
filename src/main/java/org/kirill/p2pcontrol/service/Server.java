package org.kirill.p2pcontrol.service;

import lombok.Data;

import java.net.InetSocketAddress;
import java.net.InterfaceAddress;

@Data
public class Server {
    private final InetSocketAddress publicAddress;
    private final InterfaceAddress internalAddress;
    private final String privateKey;
    private final String publicKey;
}
