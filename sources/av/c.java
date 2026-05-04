package av;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.j;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "HiltViewModelExtensions")
/* loaded from: classes8.dex */
public final class c {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements l<Object, ViewModel> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<VMF, ViewModel> f5486a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super VMF, ? extends ViewModel> lVar) {
            super(1);
            this.f5486a = lVar;
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewModel invoke(Object obj) {
            return this.f5486a.invoke(obj);
        }
    }

    @k
    public static final <VMF> CreationExtras a(@k MutableCreationExtras mutableCreationExtras, @k l<? super VMF, ? extends ViewModel> callback) {
        g0.p(mutableCreationExtras, "<this>");
        g0.p(callback, "callback");
        CreationExtras.Key<l<Object, ViewModel>> CREATION_CALLBACK_KEY = dagger.hilt.android.internal.lifecycle.d.f47608d;
        g0.o(CREATION_CALLBACK_KEY, "CREATION_CALLBACK_KEY");
        mutableCreationExtras.set(CREATION_CALLBACK_KEY, new a(callback));
        return mutableCreationExtras;
    }

    @k
    public static final <VMF> CreationExtras b(@k CreationExtras creationExtras, @k l<? super VMF, ? extends ViewModel> callback) {
        g0.p(creationExtras, "<this>");
        g0.p(callback, "callback");
        return a(new MutableCreationExtras(creationExtras), callback);
    }
}
