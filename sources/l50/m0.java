package l50;

import java.util.Iterator;
import kotlinx.serialization.json.internal.WriteMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class m0<T> implements Iterator<T>, y00.a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final k50.a f70032a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final f1 f70033b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final f50.e<T> f70034c;

    /* JADX WARN: Multi-variable type inference failed */
    public m0(@m80.k k50.a json, @m80.k f1 lexer, @m80.k f50.e<? extends T> deserializer) {
        kotlin.jvm.internal.g0.p(json, "json");
        kotlin.jvm.internal.g0.p(lexer, "lexer");
        kotlin.jvm.internal.g0.p(deserializer, "deserializer");
        this.f70032a = json;
        this.f70033b = lexer;
        this.f70034c = deserializer;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f70033b.K();
    }

    @Override // java.util.Iterator
    public T next() {
        return (T) new j1(this.f70032a, WriteMode.OBJ, this.f70033b, this.f70034c.a(), null).decodeSerializableValue(this.f70034c);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
