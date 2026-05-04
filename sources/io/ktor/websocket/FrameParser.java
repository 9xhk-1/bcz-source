package io.ktor.websocket;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFrameParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameParser.kt\nio/ktor/websocket/FrameParser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1#2:155\n*E\n"})
/* loaded from: classes8.dex */
public final class FrameParser {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final AtomicReference<State> f62314a = new AtomicReference<>(State.HEADER0);

    /* renamed from: b, reason: collision with root package name */
    public boolean f62315b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f62316c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f62317d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f62318e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f62319f;

    /* renamed from: g, reason: collision with root package name */
    public int f62320g;

    /* renamed from: h, reason: collision with root package name */
    public int f62321h;

    /* renamed from: i, reason: collision with root package name */
    public int f62322i;

    /* renamed from: j, reason: collision with root package name */
    public long f62323j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    public Integer f62324k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class State {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State HEADER0 = new State("HEADER0", 0);
        public static final State LENGTH = new State("LENGTH", 1);
        public static final State MASK_KEY = new State("MASK_KEY", 2);
        public static final State BODY = new State("BODY", 3);

        private static final /* synthetic */ State[] $values() {
            return new State[]{HEADER0, LENGTH, MASK_KEY, BODY};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private State(String str, int i11) {
        }

        @m80.k
        public static m00.a<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f62325a;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.HEADER0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.LENGTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.MASK_KEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[State.BODY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f62325a = iArr;
        }
    }

    public final void a() {
        if (!androidx.camera.view.q.a(this.f62314a, State.BODY, State.HEADER0)) {
            throw new IllegalStateException("It should be state BODY but it is " + this.f62314a.get());
        }
        this.f62320g = 0;
        this.f62323j = 0L;
        this.f62322i = 0;
        this.f62324k = null;
    }

    public final void b(@m80.k ByteBuffer bb2) {
        kotlin.jvm.internal.g0.p(bb2, "bb");
        if (kotlin.jvm.internal.g0.g(bb2.order(), ByteOrder.BIG_ENDIAN)) {
            while (l(bb2)) {
            }
            return;
        }
        throw new IllegalArgumentException(("Buffer order should be BIG_ENDIAN but it is " + bb2.order()).toString());
    }

    public final boolean c() {
        return this.f62314a.get() == State.BODY;
    }

    public final boolean d() {
        return this.f62315b;
    }

    @m80.k
    public final FrameType e() {
        FrameType a11 = FrameType.Companion.a(this.f62320g);
        if (a11 != null) {
            return a11;
        }
        throw new IllegalStateException("Unsupported opcode " + Integer.toHexString(this.f62320g));
    }

    public final long f() {
        return this.f62323j;
    }

    public final boolean g() {
        return this.f62319f;
    }

    @m80.l
    public final Integer h() {
        return this.f62324k;
    }

    public final boolean i() {
        return this.f62316c;
    }

    public final boolean j() {
        return this.f62317d;
    }

    public final boolean k() {
        return this.f62318e;
    }

    public final boolean l(ByteBuffer byteBuffer) {
        State state = this.f62314a.get();
        kotlin.jvm.internal.g0.m(state);
        int i11 = a.f62325a[state.ordinal()];
        if (i11 == 1) {
            return m(byteBuffer);
        }
        if (i11 == 2) {
            return n(byteBuffer);
        }
        if (i11 == 3) {
            return o(byteBuffer);
        }
        if (i11 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean m(ByteBuffer byteBuffer) {
        int i11 = 0;
        if (byteBuffer.remaining() < 2) {
            return false;
        }
        byte b11 = byteBuffer.get();
        byte b12 = byteBuffer.get();
        this.f62315b = (b11 & 128) != 0;
        this.f62316c = (b11 & 64) != 0;
        this.f62317d = (b11 & 32) != 0;
        this.f62318e = (b11 & 16) != 0;
        int i12 = b11 & 15;
        this.f62320g = i12;
        if (i12 == 0 && this.f62321h == 0) {
            throw new ProtocolViolationException("Can't continue finished frames");
        }
        if (i12 == 0) {
            this.f62320g = this.f62321h;
        } else if (this.f62321h != 0 && !e().getControlFrame()) {
            throw new ProtocolViolationException("Can't start new data frame before finishing previous one");
        }
        if (!e().getControlFrame()) {
            this.f62321h = this.f62315b ? 0 : this.f62320g;
        } else if (!this.f62315b) {
            throw new ProtocolViolationException("control frames can't be fragmented");
        }
        this.f62319f = (b12 & 128) != 0;
        int i13 = b12 & Byte.MAX_VALUE;
        if (e().getControlFrame() && i13 > 125) {
            throw new ProtocolViolationException("control frames can't be larger than 125 bytes");
        }
        if (i13 == 126) {
            i11 = 2;
        } else if (i13 == 127) {
            i11 = 8;
        }
        this.f62322i = i11;
        this.f62323j = i11 == 0 ? i13 : 0L;
        if (i11 > 0) {
            this.f62314a.set(State.LENGTH);
        } else if (this.f62319f) {
            this.f62314a.set(State.MASK_KEY);
        } else {
            this.f62314a.set(State.BODY);
        }
        return true;
    }

    public final boolean n(ByteBuffer byteBuffer) {
        long j11;
        int remaining = byteBuffer.remaining();
        int i11 = this.f62322i;
        if (remaining < i11) {
            return false;
        }
        if (i11 == 2) {
            j11 = byteBuffer.getShort() & j60.g.f63638t;
        } else {
            if (i11 != 8) {
                throw new IllegalStateException();
            }
            j11 = byteBuffer.getLong();
        }
        this.f62323j = j11;
        this.f62314a.set(this.f62319f ? State.MASK_KEY : State.BODY);
        return true;
    }

    public final boolean o(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            return false;
        }
        this.f62324k = Integer.valueOf(byteBuffer.getInt());
        this.f62314a.set(State.BODY);
        return true;
    }
}
