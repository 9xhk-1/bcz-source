package o1;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.ColorInt;
import androidx.annotation.MenuRes;
import androidx.appcompat.widget.PopupMenu;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public Menu f75506a;

    /* renamed from: b, reason: collision with root package name */
    public List<com.aurelhubert.ahbottomnavigation.a> f75507b;

    public a(Activity activity, @MenuRes int menuRes) {
        this.f75506a = new PopupMenu(activity, null).getMenu();
        activity.getMenuInflater().inflate(menuRes, this.f75506a);
    }

    public MenuItem a(int index) {
        return this.f75506a.getItem(index);
    }

    public com.aurelhubert.ahbottomnavigation.a b(int index) {
        return this.f75507b.get(index);
    }

    public Integer c(int menuId) {
        for (int i11 = 0; i11 < this.f75506a.size(); i11++) {
            if (this.f75506a.getItem(i11).getItemId() == menuId) {
                return Integer.valueOf(i11);
            }
        }
        return null;
    }

    public void d(AHBottomNavigation ahBottomNavigation) {
        e(ahBottomNavigation, null);
    }

    public void e(AHBottomNavigation ahBottomNavigation, @ColorInt int[] colors) {
        List<com.aurelhubert.ahbottomnavigation.a> list = this.f75507b;
        if (list == null) {
            this.f75507b = new ArrayList();
        } else {
            list.clear();
        }
        if (this.f75506a != null) {
            for (int i11 = 0; i11 < this.f75506a.size(); i11++) {
                MenuItem item = this.f75506a.getItem(i11);
                if (colors == null || colors.length < this.f75506a.size() || colors[i11] == 0) {
                    this.f75507b.add(new com.aurelhubert.ahbottomnavigation.a(String.valueOf(item.getTitle()), item.getIcon()));
                } else {
                    this.f75507b.add(new com.aurelhubert.ahbottomnavigation.a(String.valueOf(item.getTitle()), item.getIcon(), colors[i11]));
                }
            }
            ahBottomNavigation.D();
            ahBottomNavigation.h(this.f75507b);
        }
    }
}
