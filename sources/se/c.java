package se;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.dataset.models.AllTopCategoryInfo;
import com.baicizhan.client.business.dataset.models.BookCategory;
import com.baicizhan.client.business.dataset.models.UserIdentityLevelInfo;
import com.baicizhan.client.business.managers.booklist.BookListManager;
import com.baicizhan.main.activity.idenity.UserIdentity;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final c f88370a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final int f88371b = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends bp.a<List<? extends AllTopCategoryInfo>> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends bp.a<List<? extends UserIdentityLevelInfo>> {
    }

    public static final List d() {
        return (List) i9.f.e(pb.a.a(), i9.f.f60368e, new a().getType(), false);
    }

    public static final UserIdentityLevelInfo g(UserIdentity userIdentity) {
        Object obj;
        List list = (List) i9.f.e(pb.a.a(), i9.f.f60366d, new b().getType(), false);
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((UserIdentityLevelInfo) obj).getIdentityId() == userIdentity.ordinal()) {
                    break;
                }
            }
            UserIdentityLevelInfo userIdentityLevelInfo = (UserIdentityLevelInfo) obj;
            if (userIdentityLevelInfo != null) {
                return userIdentityLevelInfo;
            }
        }
        throw new RuntimeException("identity not found");
    }

    @m80.k
    public final rx.c<List<AllTopCategoryInfo>> c() {
        rx.c<List<AllTopCategoryInfo>> w52 = rx.c.z2(new Callable() { // from class: se.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List d11;
                d11 = c.d();
                return d11;
            }
        }).w5(bc0.c.e());
        g0.o(w52, "subscribeOn(...)");
        return w52;
    }

    @m80.k
    public final List<BookCategory> e(@m80.k List<String> categoryIds) {
        g0.p(categoryIds, "categoryIds");
        List<BookCategory> bookCategoriesById = BookListManager.getInstance().getBookCategoriesById(categoryIds);
        g0.o(bookCategoriesById, "getBookCategoriesById(...)");
        return bookCategoriesById;
    }

    @m80.k
    public final rx.c<UserIdentityLevelInfo> f(@m80.k final UserIdentity identity) {
        g0.p(identity, "identity");
        rx.c<UserIdentityLevelInfo> w52 = rx.c.z2(new Callable() { // from class: se.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                UserIdentityLevelInfo g11;
                g11 = c.g(UserIdentity.this);
                return g11;
            }
        }).w5(bc0.c.e());
        g0.o(w52, "subscribeOn(...)");
        return w52;
    }

    @m80.k
    public final rx.c<Integer> h(@m80.k Context context) {
        g0.p(context, "context");
        if (BookListManager.getInstance().isReady()) {
            rx.c<Integer> M2 = rx.c.M2(0);
            g0.m(M2);
            return M2;
        }
        rx.c<Integer> load = BookListManager.getInstance().load(context);
        g0.m(load);
        return load;
    }
}
