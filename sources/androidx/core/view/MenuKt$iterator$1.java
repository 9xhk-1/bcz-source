package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt$iterator$1\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n83#2:91\n1#3:92\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt$iterator$1\n*L\n74#1:91\n74#1:92\n*E\n"})
/* loaded from: classes2.dex */
public final class MenuKt$iterator$1 implements Iterator<MenuItem>, y00.d {
    final /* synthetic */ Menu $this_iterator;
    private int index;

    public MenuKt$iterator$1(Menu menu) {
        this.$this_iterator = menu;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.$this_iterator.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        yz.g2 g2Var;
        Menu menu = this.$this_iterator;
        int i11 = this.index - 1;
        this.index = i11;
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

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @m80.k
    public MenuItem next() {
        Menu menu = this.$this_iterator;
        int i11 = this.index;
        this.index = i11 + 1;
        MenuItem item = menu.getItem(i11);
        if (item != null) {
            return item;
        }
        throw new IndexOutOfBoundsException();
    }
}
