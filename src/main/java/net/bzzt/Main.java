package net.bzzt;

import com.akkaserverless.javasdk.AkkaServerless;

public final class Main {
    
    public static void main(String[] args) throws Exception {
        new AkkaServerless()
            .registerEventSourcedEntity(
                MyServiceEntityImpl.class,
                MyEntity.getDescriptor().findServiceByName("MyServiceEntity"),
                MyEntity.getDescriptor()
            )
            .start().toCompletableFuture().get();
    }
    
}