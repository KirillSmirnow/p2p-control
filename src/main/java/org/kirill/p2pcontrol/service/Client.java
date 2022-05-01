package org.kirill.p2pcontrol.service;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.net.InterfaceAddress;

@Data
@EqualsAndHashCode(of = "name")
public class Client {
    private final String name;
    private final InterfaceAddress internalAddress;
    private final String privateKey;
    private final String publicKey;
}
