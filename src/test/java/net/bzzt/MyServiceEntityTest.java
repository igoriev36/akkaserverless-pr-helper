package net.bzzt;

import com.akkaserverless.javasdk.eventsourcedentity.CommandContext;
import com.google.protobuf.Empty;
import org.junit.Test;
import org.mockito.*;

public class MyServiceEntityTest {
    private String entityId = "entityId1";
    private MyServiceEntityImpl entity;
    private CommandContext context = Mockito.mock(CommandContext.class);
    
    @Test
    public void setValueTest() {
        entity = new MyServiceEntityImpl(entityId);
        
        // TODO: you may want to set fields in addition to the entity id
        //    entity.setValue(MyEntity.SetValueCommand.newBuilder().setEntityId(entityId).build(), context);
        
        // TODO: if you wish to verify events:
        //    Mockito.verify(context).emit(event);
    }
    
    @Test
    public void getValueTest() {
        entity = new MyServiceEntityImpl(entityId);
        
        // TODO: you may want to set fields in addition to the entity id
        //    entity.getValue(MyEntity.GetValueCommand.newBuilder().setEntityId(entityId).build(), context);
        
        // TODO: if you wish to verify events:
        //    Mockito.verify(context).emit(event);
    }
}