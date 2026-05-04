package androidx.datastore.core;

import kotlin.coroutines.d;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class UpdatingDataContextElement implements d.b {

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final String NESTED_UPDATE_ERROR_MESSAGE = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";

    @k
    private final DataStoreImpl<?> instance;

    @l
    private final UpdatingDataContextElement parent;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Key implements d.c<UpdatingDataContextElement> {

            @k
            public static final Key INSTANCE = new Key();

            private Key() {
            }
        }

        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final String getNESTED_UPDATE_ERROR_MESSAGE$datastore_core_release() {
            return UpdatingDataContextElement.NESTED_UPDATE_ERROR_MESSAGE;
        }

        private Companion() {
        }
    }

    public UpdatingDataContextElement(@l UpdatingDataContextElement updatingDataContextElement, @k DataStoreImpl<?> instance) {
        g0.p(instance, "instance");
        this.parent = updatingDataContextElement;
        this.instance = instance;
    }

    public final void checkNotUpdating(@k DataStore<?> candidate) {
        g0.p(candidate, "candidate");
        if (this.instance == candidate) {
            throw new IllegalStateException(NESTED_UPDATE_ERROR_MESSAGE.toString());
        }
        UpdatingDataContextElement updatingDataContextElement = this.parent;
        if (updatingDataContextElement != null) {
            updatingDataContextElement.checkNotUpdating(candidate);
        }
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    public <R> R fold(R r11, @k p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) d.b.a.a(this, r11, pVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @l
    public <E extends d.b> E get(@k d.c<E> cVar) {
        return (E) d.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d.b
    @k
    public d.c<?> getKey() {
        return Companion.Key.INSTANCE;
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @k
    public d minusKey(@k d.c<?> cVar) {
        return d.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.d
    @k
    public d plus(@k d dVar) {
        return d.b.a.d(this, dVar);
    }
}
