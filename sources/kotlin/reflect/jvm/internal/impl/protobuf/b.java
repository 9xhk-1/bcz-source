package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class b<MessageType extends n> implements p<MessageType> {

    /* renamed from: a, reason: collision with root package name */
    public static final f f67536a = f.c();

    public final MessageType e(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw f(messagetype).asInvalidProtocolBufferException().setUnfinishedMessage(messagetype);
    }

    public final UninitializedMessageException f(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).newUninitializedMessageException() : new UninitializedMessageException(messagetype);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public MessageType a(InputStream inputStream, f fVar) throws InvalidProtocolBufferException {
        return e(j(inputStream, fVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public MessageType b(InputStream inputStream, f fVar) throws InvalidProtocolBufferException {
        return e(k(inputStream, fVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public MessageType c(d dVar, f fVar) throws InvalidProtocolBufferException {
        return e(l(dVar, fVar));
    }

    public MessageType j(InputStream inputStream, f fVar) throws InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return k(new a.AbstractC0798a.C0799a(inputStream, e.B(read, inputStream)), fVar);
        } catch (IOException e11) {
            throw new InvalidProtocolBufferException(e11.getMessage());
        }
    }

    public MessageType k(InputStream inputStream, f fVar) throws InvalidProtocolBufferException {
        e g11 = e.g(inputStream);
        MessageType messagetype = (MessageType) d(g11, fVar);
        try {
            g11.a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e11) {
            throw e11.setUnfinishedMessage(messagetype);
        }
    }

    public MessageType l(d dVar, f fVar) throws InvalidProtocolBufferException {
        e p11 = dVar.p();
        MessageType messagetype = (MessageType) d(p11, fVar);
        try {
            p11.a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e11) {
            throw e11.setUnfinishedMessage(messagetype);
        }
    }
}
