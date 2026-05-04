package androidx.datastore.core;

import c40.x;
import j00.c;
import kotlin.coroutines.d;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public abstract class Message<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Read<T> extends Message<T> {

        @l
        private final State<T> lastState;

        public Read(@l State<T> state) {
            super(null);
            this.lastState = state;
        }

        @Override // androidx.datastore.core.Message
        @l
        public State<T> getLastState() {
            return this.lastState;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Update<T> extends Message<T> {

        @k
        private final x<T> ack;

        @k
        private final d callerContext;

        @l
        private final State<T> lastState;

        @k
        private final p<T, c<? super T>, Object> transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Update(@k p<? super T, ? super c<? super T>, ? extends Object> transform, @k x<T> ack, @l State<T> state, @k d callerContext) {
            super(null);
            g0.p(transform, "transform");
            g0.p(ack, "ack");
            g0.p(callerContext, "callerContext");
            this.transform = transform;
            this.ack = ack;
            this.lastState = state;
            this.callerContext = callerContext;
        }

        @k
        public final x<T> getAck() {
            return this.ack;
        }

        @k
        public final d getCallerContext() {
            return this.callerContext;
        }

        @Override // androidx.datastore.core.Message
        @l
        public State<T> getLastState() {
            return this.lastState;
        }

        @k
        public final p<T, c<? super T>, Object> getTransform() {
            return this.transform;
        }
    }

    public /* synthetic */ Message(v vVar) {
        this();
    }

    @l
    public abstract State<T> getLastState();

    private Message() {
    }
}
