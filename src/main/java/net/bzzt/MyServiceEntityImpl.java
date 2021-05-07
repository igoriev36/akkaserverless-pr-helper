package net.bzzt;

import com.akkaserverless.javasdk.EntityId;
import com.akkaserverless.javasdk.eventsourcedentity.*;
import com.google.protobuf.Empty;
import net.bzzt.persistence.Domain;

/** An event sourced entity. */
@EventSourcedEntity(entityType = "MyServiceEntity")
public class MyServiceEntityImpl extends MyServiceEntity {
    @SuppressWarnings("unused")
    private final String entityId;
    
    public MyServiceEntityImpl(@EntityId String entityId) {
        this.entityId = entityId;
    }
    
    @Override
    public Domain.MyState snapshot() {
        // TODO: produce state snapshot here
        return Domain.MyState.newBuilder().build();
    }
    
    @Override
    public void handleSnapshot(Domain.MyState snapshot) {
        // TODO: restore state from snapshot here
        
    }

    @Override
    public Empty webHook(MyEntity.PullRequestData command, CommandContext ctx) {
        System.out.println("WebHook called for PR " + command.getNumber());
        return Empty.getDefaultInstance();
    }

    @Override
    public Empty setValue(MyEntity.SetValueCommand command, CommandContext ctx) {
        throw ctx.fail("The command handler for `SetValue` is not implemented, yet");
    }
    
    @Override
    public MyEntity.MyResult getValue(MyEntity.GetValueCommand command, CommandContext ctx) {
        throw ctx.fail("The command handler for `GetValue` is not implemented, yet");
    }
    
    @Override
    public void valueSet(Domain.ValueSet event) {
        throw new RuntimeException("The event handler for `ValueSet` is not implemented, yet");
    }
}