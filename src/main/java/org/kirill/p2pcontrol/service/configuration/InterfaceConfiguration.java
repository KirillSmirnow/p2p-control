package org.kirill.p2pcontrol.service.configuration;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.net.InetSocketAddress;
import java.net.InterfaceAddress;
import java.time.Duration;
import java.util.List;

@Data
@EqualsAndHashCode(of = "name")
@Key("[Interface]")
public class InterfaceConfiguration {

    @Key("Name")
    private final String name;

    @Key("PrivateKey")
    private final String privateKey;

    @Key("Address")
    private final InterfaceAddress internalAddress;

    @Key("ListenPort")
    private final Integer portToListen;

    private final List<Peer> peers;

    @Data
    @EqualsAndHashCode(of = "name")
    @Key("[Peer]")
    private static class Peer {

        @Key("Name")
        private final String name;

        @Key("PublicKey")
        private final String publicKey;

        @Key("Endpoint")
        private final InetSocketAddress publicAddress;

        @Key("PersistentKeepalive")
        private final Duration keepaliveTime;

        @Key("AllowedIPs")
        private final List<InterfaceAddress> destinationAddresses;
    }
}
