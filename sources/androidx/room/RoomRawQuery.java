package androidx.room;

import androidx.sqlite.SQLiteStatement;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class RoomRawQuery {

    @m80.k
    private final x00.l<SQLiteStatement, g2> bindingFunction;

    @m80.k
    private final String sql;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @w00.k
    public RoomRawQuery(@m80.k String sql) {
        this(sql, null, 2, 0 == true ? 1 : 0);
        g0.p(sql, "sql");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 _init_$lambda$0(SQLiteStatement it) {
        g0.p(it, "it");
        return g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 bindingFunction$lambda$1(x00.l lVar, SQLiteStatement it) {
        g0.p(it, "it");
        lVar.invoke(new BindOnlySQLiteStatement(it));
        return g2.f100423a;
    }

    @m80.k
    public final x00.l<SQLiteStatement, g2> getBindingFunction() {
        return this.bindingFunction;
    }

    @m80.k
    public final String getSql() {
        return this.sql;
    }

    @w00.k
    public RoomRawQuery(@m80.k String sql, @m80.k final x00.l<? super SQLiteStatement, g2> onBindStatement) {
        g0.p(sql, "sql");
        g0.p(onBindStatement, "onBindStatement");
        this.sql = sql;
        this.bindingFunction = new x00.l() { // from class: androidx.room.p
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 bindingFunction$lambda$1;
                bindingFunction$lambda$1 = RoomRawQuery.bindingFunction$lambda$1(x00.l.this, (SQLiteStatement) obj);
                return bindingFunction$lambda$1;
            }
        };
    }

    public /* synthetic */ RoomRawQuery(String str, x00.l lVar, int i11, kotlin.jvm.internal.v vVar) {
        this(str, (i11 & 2) != 0 ? new x00.l() { // from class: androidx.room.q
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 _init_$lambda$0;
                _init_$lambda$0 = RoomRawQuery._init_$lambda$0((SQLiteStatement) obj);
                return _init_$lambda$0;
            }
        } : lVar);
    }
}
