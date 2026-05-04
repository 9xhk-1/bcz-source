package l60;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.jiongji.andriod.card.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nForwardingFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForwardingFileSystem.kt\nokio/ForwardingFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,252:1\n1634#2,3:253\n1634#2,3:256\n*S KotlinDebug\n*F\n+ 1 ForwardingFileSystem.kt\nokio/ForwardingFileSystem\n*L\n170#1:253,3\n178#1:256,3\n*E\n"})
/* loaded from: classes8.dex */
public abstract class u extends okio.b {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final okio.b f70497e;

    public u(@m80.k okio.b delegate) {
        kotlin.jvm.internal.g0.p(delegate, "delegate");
        this.f70497e = delegate;
    }

    public static final okio.f K0(u uVar, okio.f it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return uVar.N0(it, "listRecursively");
    }

    @Override // okio.b
    @m80.k
    public e1 D0(@m80.k okio.f file, boolean z11) throws IOException {
        kotlin.jvm.internal.g0.p(file, "file");
        return this.f70497e.D0(L0(file, "sink", "file"), z11);
    }

    @Override // okio.b
    @m80.k
    public g1 F0(@m80.k okio.f file) throws IOException {
        kotlin.jvm.internal.g0.p(file, "file");
        return this.f70497e.F0(L0(file, "source", "file"));
    }

    @w00.j(name = "delegate")
    @m80.k
    public final okio.b H0() {
        return this.f70497e;
    }

    @Override // okio.b
    public void I(@m80.k okio.f dir, boolean z11) throws IOException {
        kotlin.jvm.internal.g0.p(dir, "dir");
        this.f70497e.I(L0(dir, "createDirectory", "dir"), z11);
    }

    @m80.k
    public okio.f L0(@m80.k okio.f path, @m80.k String functionName, @m80.k String parameterName) {
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(functionName, "functionName");
        kotlin.jvm.internal.g0.p(parameterName, "parameterName");
        return path;
    }

    @m80.k
    public okio.f N0(@m80.k okio.f path, @m80.k String functionName) {
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(functionName, "functionName");
        return path;
    }

    @Override // okio.b
    public void S(@m80.k okio.f source, @m80.k okio.f target) throws IOException {
        kotlin.jvm.internal.g0.p(source, "source");
        kotlin.jvm.internal.g0.p(target, "target");
        this.f70497e.S(L0(source, "createSymlink", "source"), L0(target, "createSymlink", TypedValues.AttributesType.S_TARGET));
    }

    @Override // okio.b
    public void V(@m80.k okio.f path, boolean z11) throws IOException {
        kotlin.jvm.internal.g0.p(path, "path");
        this.f70497e.V(L0(path, "delete", "path"), z11);
    }

    @Override // okio.b, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f70497e.close();
    }

    @Override // okio.b
    @m80.k
    public e1 i(@m80.k okio.f file, boolean z11) throws IOException {
        kotlin.jvm.internal.g0.p(file, "file");
        return this.f70497e.i(L0(file, "appendingSink", "file"), z11);
    }

    @Override // okio.b
    @m80.k
    public List<okio.f> i0(@m80.k okio.f dir) throws IOException {
        kotlin.jvm.internal.g0.p(dir, "dir");
        List<okio.f> i02 = this.f70497e.i0(L0(dir, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = i02.iterator();
        while (it.hasNext()) {
            arrayList.add(N0((okio.f) it.next(), "list"));
        }
        a00.l0.o0(arrayList);
        return arrayList;
    }

    @Override // okio.b
    public void k(@m80.k okio.f source, @m80.k okio.f target) throws IOException {
        kotlin.jvm.internal.g0.p(source, "source");
        kotlin.jvm.internal.g0.p(target, "target");
        this.f70497e.k(L0(source, "atomicMove", "source"), L0(target, "atomicMove", TypedValues.AttributesType.S_TARGET));
    }

    @Override // okio.b
    @m80.l
    public List<okio.f> k0(@m80.k okio.f dir) {
        kotlin.jvm.internal.g0.p(dir, "dir");
        List<okio.f> k02 = this.f70497e.k0(L0(dir, "listOrNull", "dir"));
        if (k02 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = k02.iterator();
        while (it.hasNext()) {
            arrayList.add(N0((okio.f) it.next(), "listOrNull"));
        }
        a00.l0.o0(arrayList);
        return arrayList;
    }

    @Override // okio.b
    @m80.k
    public q30.m<okio.f> o0(@m80.k okio.f dir, boolean z11) {
        kotlin.jvm.internal.g0.p(dir, "dir");
        return q30.k0.N1(this.f70497e.o0(L0(dir, "listRecursively", "dir"), z11), new x00.l() { // from class: l60.t
            @Override // x00.l
            public final Object invoke(Object obj) {
                okio.f K0;
                K0 = u.K0(u.this, (okio.f) obj);
                return K0;
            }
        });
    }

    @Override // okio.b
    @m80.k
    public okio.f q(@m80.k okio.f path) throws IOException {
        kotlin.jvm.internal.g0.p(path, "path");
        return N0(this.f70497e.q(L0(path, "canonicalize", "path")), "canonicalize");
    }

    @m80.k
    public String toString() {
        return kotlin.jvm.internal.o0.d(getClass()).C() + '(' + this.f70497e + ')';
    }

    @Override // okio.b
    @m80.l
    public s w0(@m80.k okio.f path) throws IOException {
        kotlin.jvm.internal.g0.p(path, "path");
        s w02 = this.f70497e.w0(L0(path, "metadataOrNull", "path"));
        if (w02 == null) {
            return null;
        }
        return w02.i() == null ? w02 : s.b(w02, false, false, N0(w02.i(), "metadataOrNull"), null, null, null, null, null, R.styleable.Theme_drawable_wiki_sound, null);
    }

    @Override // okio.b
    @m80.k
    public r x0(@m80.k okio.f file) throws IOException {
        kotlin.jvm.internal.g0.p(file, "file");
        return this.f70497e.x0(L0(file, "openReadOnly", "file"));
    }

    @Override // okio.b
    @m80.k
    public r z0(@m80.k okio.f file, boolean z11, boolean z12) throws IOException {
        kotlin.jvm.internal.g0.p(file, "file");
        return this.f70497e.z0(L0(file, "openReadWrite", "file"), z11, z12);
    }
}
