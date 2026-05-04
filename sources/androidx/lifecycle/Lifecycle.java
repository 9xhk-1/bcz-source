package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.Lifecycle;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.y;
import m80.k;
import m80.l;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lifecycle.kt\nandroidx/lifecycle/Lifecycle\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,390:1\n1#2:391\n*E\n"})
/* loaded from: classes2.dex */
public abstract class Lifecycle {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    private AtomicReference<Object> internalScopeRef = new AtomicReference<>(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Event {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;


        @k
        public static final Companion Companion = new Companion(null);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[State.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(v vVar) {
                this();
            }

            @l
            @o
            public final Event downFrom(@k State state) {
                g0.p(state, "state");
                int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i11 == 1) {
                    return Event.ON_DESTROY;
                }
                if (i11 == 2) {
                    return Event.ON_STOP;
                }
                if (i11 != 3) {
                    return null;
                }
                return Event.ON_PAUSE;
            }

            @l
            @o
            public final Event downTo(@k State state) {
                g0.p(state, "state");
                int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i11 == 1) {
                    return Event.ON_STOP;
                }
                if (i11 == 2) {
                    return Event.ON_PAUSE;
                }
                if (i11 != 4) {
                    return null;
                }
                return Event.ON_DESTROY;
            }

            @l
            @o
            public final Event upFrom(@k State state) {
                g0.p(state, "state");
                int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i11 == 1) {
                    return Event.ON_START;
                }
                if (i11 == 2) {
                    return Event.ON_RESUME;
                }
                if (i11 != 5) {
                    return null;
                }
                return Event.ON_CREATE;
            }

            @l
            @o
            public final Event upTo(@k State state) {
                g0.p(state, "state");
                int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i11 == 1) {
                    return Event.ON_CREATE;
                }
                if (i11 == 2) {
                    return Event.ON_START;
                }
                if (i11 != 3) {
                    return null;
                }
                return Event.ON_RESUME;
            }

            private Companion() {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Event.values().length];
                try {
                    iArr[Event.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Event.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Event.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Event.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Event.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Event.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Event.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @l
        @o
        public static final Event downFrom(@k State state) {
            return Companion.downFrom(state);
        }

        @l
        @o
        public static final Event downTo(@k State state) {
            return Companion.downTo(state);
        }

        @l
        @o
        public static final Event upFrom(@k State state) {
            return Companion.upFrom(state);
        }

        @l
        @o
        public static final Event upTo(@k State state) {
            return Companion.upTo(state);
        }

        @k
        public final State getTargetState() {
            switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
                case 1:
                case 2:
                    return State.CREATED;
                case 3:
                case 4:
                    return State.STARTED;
                case 5:
                    return State.RESUMED;
                case 6:
                    return State.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean isAtLeast(@k State state) {
            g0.p(state, "state");
            return compareTo(state) >= 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_currentStateFlow_$lambda$0(y mutableStateFlow, LifecycleOwner lifecycleOwner, Event event) {
        g0.p(mutableStateFlow, "$mutableStateFlow");
        g0.p(lifecycleOwner, "<anonymous parameter 0>");
        g0.p(event, "event");
        mutableStateFlow.setValue(event.getTargetState());
    }

    @MainThread
    public abstract void addObserver(@k LifecycleObserver lifecycleObserver);

    @MainThread
    @k
    public abstract State getCurrentState();

    @k
    public m0<State> getCurrentStateFlow() {
        final y a11 = o0.a(getCurrentState());
        addObserver(new LifecycleEventObserver() { // from class: androidx.lifecycle.e
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Lifecycle._get_currentStateFlow_$lambda$0(y.this, lifecycleOwner, event);
            }
        });
        return kotlinx.coroutines.flow.k.n(a11);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    public final AtomicReference<Object> getInternalScopeRef() {
        return this.internalScopeRef;
    }

    @MainThread
    public abstract void removeObserver(@k LifecycleObserver lifecycleObserver);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setInternalScopeRef(@k AtomicReference<Object> atomicReference) {
        g0.p(atomicReference, "<set-?>");
        this.internalScopeRef = atomicReference;
    }
}
