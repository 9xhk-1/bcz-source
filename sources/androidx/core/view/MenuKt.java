package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
/* loaded from: classes2.dex */
public final class MenuKt {
    public static final boolean contains(@m80.k Menu menu, @m80.k MenuItem menuItem) {
        int size = menu.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (kotlin.jvm.internal.g0.g(menu.getItem(i11), menuItem)) {
                return true;
            }
        }
        return false;
    }

    public static final void forEach(@m80.k Menu menu, @m80.k x00.l<? super MenuItem, yz.g2> lVar) {
        int size = menu.size();
        for (int i11 = 0; i11 < size; i11++) {
            lVar.invoke(menu.getItem(i11));
        }
    }

    public static final void forEachIndexed(@m80.k Menu menu, @m80.k x00.p<? super Integer, ? super MenuItem, yz.g2> pVar) {
        int size = menu.size();
        for (int i11 = 0; i11 < size; i11++) {
            pVar.invoke(Integer.valueOf(i11), menu.getItem(i11));
        }
    }

    @m80.k
    public static final MenuItem get(@m80.k Menu menu, int i11) {
        return menu.getItem(i11);
    }

    @m80.k
    public static final q30.m<MenuItem> getChildren(@m80.k final Menu menu) {
        return new q30.m<MenuItem>() { // from class: androidx.core.view.MenuKt$children$1
            @Override // q30.m
            @m80.k
            public Iterator<MenuItem> iterator() {
                return MenuKt.iterator(menu);
            }
        };
    }

    public static final int getSize(@m80.k Menu menu) {
        return menu.size();
    }

    public static final boolean isEmpty(@m80.k Menu menu) {
        return menu.size() == 0;
    }

    public static final boolean isNotEmpty(@m80.k Menu menu) {
        return menu.size() != 0;
    }

    @m80.k
    public static final Iterator<MenuItem> iterator(@m80.k Menu menu) {
        return new MenuKt$iterator$1(menu);
    }

    public static final void minusAssign(@m80.k Menu menu, @m80.k MenuItem menuItem) {
        menu.removeItem(menuItem.getItemId());
    }

    public static final void removeItemAt(@m80.k Menu menu, int i11) {
        yz.g2 g2Var;
        MenuItem item = menu.getItem(i11);
        if (item != null) {
            menu.removeItem(item.getItemId());
            g2Var = yz.g2.f100423a;
        } else {
            g2Var = null;
        }
        if (g2Var == null) {
            throw new IndexOutOfBoundsException();
        }
    }
}
