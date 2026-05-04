package kk;

import androidx.annotation.NonNull;
import java.io.File;
import mk.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class e<DataType> implements a.b {

    /* renamed from: a, reason: collision with root package name */
    public final ik.a<DataType> f66646a;

    /* renamed from: b, reason: collision with root package name */
    public final DataType f66647b;

    /* renamed from: c, reason: collision with root package name */
    public final ik.e f66648c;

    public e(ik.a<DataType> aVar, DataType datatype, ik.e eVar) {
        this.f66646a = aVar;
        this.f66647b = datatype;
        this.f66648c = eVar;
    }

    @Override // mk.a.b
    public boolean a(@NonNull File file) {
        return this.f66646a.b(this.f66647b, file, this.f66648c);
    }
}
