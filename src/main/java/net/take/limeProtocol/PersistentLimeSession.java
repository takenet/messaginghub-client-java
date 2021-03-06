package net.take.limeProtocol;

import org.limeprotocol.*;
import org.limeprotocol.client.ClientChannel;

import java.io.IOException;
import java.util.concurrent.Future;
import java.util.function.Function;

public interface PersistentLimeSession {

    void start() throws Exception;

    void stop() throws IOException;

    ClientChannel getClientChannel();

    Message receiveMessage();
    void sendMessage(Message message) throws IOException;

    Command receiveCommand();
    void sendCommand(Command command) throws IOException;

    Notification receiveNotification();
    void sendNotification(Notification notification) throws IOException;

    void setResource(LimeUri uri, Document resource, Function<Command, Void> unrelatedCommandHandler) throws IOException;
}
