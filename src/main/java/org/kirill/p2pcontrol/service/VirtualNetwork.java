package org.kirill.p2pcontrol.service;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Map;

@Data
@EqualsAndHashCode(of = "name")
public class VirtualNetwork {
    private final String name;
    private final Server server;
    private final Map<String, Client> clientsByName;
}
