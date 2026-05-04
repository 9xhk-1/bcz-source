package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.d;
import m80.k;
import m80.l;
import m80.o;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface Composer {

    @k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @k
        private static final Object Empty = new Object() { // from class: androidx.compose.runtime.Composer$Companion$Empty$1
            public String toString() {
                return "Empty";
            }
        };

        private Companion() {
        }

        @k
        public final Object getEmpty() {
            return Empty;
        }

        @InternalComposeTracingApi
        public final void setTracer(@l CompositionTracer compositionTracer) {
            ComposerKt.compositionTracer = compositionTracer;
        }
    }

    @ComposeCompilerApi
    <V, T> void apply(V v11, @k p<? super T, ? super V, g2> pVar);

    @InternalComposeApi
    @k
    CompositionContext buildContext();

    @ComposeCompilerApi
    boolean changed(@l Object obj);

    @ComposeCompilerApi
    default boolean changed(boolean z11) {
        return changed(z11);
    }

    @ComposeCompilerApi
    default boolean changedInstance(@l Object obj) {
        return changed(obj);
    }

    void collectParameterInformation();

    @InternalComposeApi
    <T> T consume(@k CompositionLocal<T> compositionLocal);

    @ComposeCompilerApi
    <T> void createNode(@k x00.a<? extends T> aVar);

    @ComposeCompilerApi
    void deactivateToEndGroup(boolean z11);

    @ComposeCompilerApi
    void disableReusing();

    @o
    void disableSourceInformation();

    @ComposeCompilerApi
    void enableReusing();

    @ComposeCompilerApi
    void endDefaults();

    @ComposeCompilerApi
    void endMovableGroup();

    @ComposeCompilerApi
    void endNode();

    @InternalComposeApi
    void endProvider();

    @InternalComposeApi
    void endProviders();

    @ComposeCompilerApi
    void endReplaceGroup();

    @ComposeCompilerApi
    void endReplaceableGroup();

    @l
    @ComposeCompilerApi
    ScopeUpdateScope endRestartGroup();

    @ComposeCompilerApi
    void endReusableGroup();

    @ComposeCompilerApi
    void endToMarker(int i11);

    @k
    Applier<?> getApplier();

    @k
    @o
    d getApplyCoroutineContext();

    @k
    @o
    ControlledComposition getComposition();

    @k
    CompositionData getCompositionData();

    int getCompoundKeyHash();

    @k
    CompositionLocalMap getCurrentCompositionLocalMap();

    int getCurrentMarker();

    boolean getDefaultsInvalid();

    boolean getInserting();

    @l
    RecomposeScope getRecomposeScope();

    @l
    Object getRecomposeScopeIdentity();

    boolean getSkipping();

    @InternalComposeApi
    void insertMovableContent(@k MovableContent<?> movableContent, @l Object obj);

    @InternalComposeApi
    void insertMovableContentReferences(@k List<Pair<MovableContentStateReference, MovableContentStateReference>> list);

    @ComposeCompilerApi
    @k
    Object joinKey(@l Object obj, @l Object obj2);

    @InternalComposeApi
    void recordSideEffect(@k x00.a<g2> aVar);

    @InternalComposeApi
    void recordUsed(@k RecomposeScope recomposeScope);

    @l
    @ComposeCompilerApi
    Object rememberedValue();

    @InternalComposeApi
    boolean shouldExecute(boolean z11, int i11);

    @ComposeCompilerApi
    void skipCurrentGroup();

    @ComposeCompilerApi
    void skipToGroupEnd();

    void sourceInformation(@k String str);

    void sourceInformationMarkerEnd();

    void sourceInformationMarkerStart(int i11, @k String str);

    @ComposeCompilerApi
    void startDefaults();

    @ComposeCompilerApi
    void startMovableGroup(int i11, @l Object obj);

    @ComposeCompilerApi
    void startNode();

    @InternalComposeApi
    void startProvider(@k ProvidedValue<?> providedValue);

    @InternalComposeApi
    void startProviders(@k ProvidedValue<?>[] providedValueArr);

    @ComposeCompilerApi
    void startReplaceGroup(int i11);

    @ComposeCompilerApi
    void startReplaceableGroup(int i11);

    @ComposeCompilerApi
    @k
    Composer startRestartGroup(int i11);

    @ComposeCompilerApi
    void startReusableGroup(int i11, @l Object obj);

    @ComposeCompilerApi
    void startReusableNode();

    @ComposeCompilerApi
    void updateRememberedValue(@l Object obj);

    @ComposeCompilerApi
    void useNode();

    @ComposeCompilerApi
    default boolean changed(char c11) {
        return changed(c11);
    }

    @ComposeCompilerApi
    default boolean changed(byte b11) {
        return changed(b11);
    }

    @ComposeCompilerApi
    default boolean changed(short s11) {
        return changed(s11);
    }

    @ComposeCompilerApi
    default boolean changed(int i11) {
        return changed(i11);
    }

    @ComposeCompilerApi
    default boolean changed(float f11) {
        return changed(f11);
    }

    @ComposeCompilerApi
    default boolean changed(long j11) {
        return changed(j11);
    }

    @ComposeCompilerApi
    default boolean changed(double d11) {
        return changed(d11);
    }

    @ComposeCompilerApi
    static /* synthetic */ void getApplier$annotations() {
    }

    @InternalComposeApi
    static /* synthetic */ void getApplyCoroutineContext$annotations() {
    }

    @InternalComposeApi
    static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getCurrentMarker$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getInserting$annotations() {
    }

    @InternalComposeApi
    static /* synthetic */ void getRecomposeScope$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getRecomposeScopeIdentity$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getSkipping$annotations() {
    }
}
