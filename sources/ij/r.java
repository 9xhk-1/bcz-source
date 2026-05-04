package ij;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.word_book.data.db.WordBookDatabase;
import com.baicizhan.main.word_book.data.impl.WordBookManagerImpl;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class r implements yz.c0<q> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f60661d = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Context f60662a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final WordBookDatabase f60663b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public q f60664c;

    public r(@m80.k Context context, @m80.k WordBookDatabase db2) {
        g0.p(context, "context");
        g0.p(db2, "db");
        this.f60662a = context;
        this.f60663b = db2;
    }

    @Override // yz.c0
    @m80.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public q getValue() {
        Context applicationContext = this.f60662a.getApplicationContext();
        q qVar = this.f60664c;
        if (qVar != null) {
            return qVar;
        }
        WordBookDatabase wordBookDatabase = this.f60663b;
        g0.m(applicationContext);
        WordBookManagerImpl wordBookManagerImpl = new WordBookManagerImpl(wordBookDatabase, new com.baicizhan.main.word_book.data.impl.d(applicationContext), new oj.c(applicationContext), null, null, null, 56, null);
        this.f60664c = wordBookManagerImpl;
        return wordBookManagerImpl;
    }

    @Override // yz.c0
    public boolean isInitialized() {
        return this.f60664c != null;
    }
}
