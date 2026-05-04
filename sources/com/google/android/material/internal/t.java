package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Dimension;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import com.google.android.material.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class t implements MenuPresenter {
    public static final int E = 0;
    public static final String F = "android:menu:list";
    public static final String G = "android:menu:adapter";
    public static final String H = "android:menu:header";
    public int A;
    public int B;

    /* renamed from: a, reason: collision with root package name */
    public NavigationMenuView f31625a;

    /* renamed from: b, reason: collision with root package name */
    public LinearLayout f31626b;

    /* renamed from: c, reason: collision with root package name */
    public MenuPresenter.Callback f31627c;

    /* renamed from: d, reason: collision with root package name */
    public MenuBuilder f31628d;

    /* renamed from: e, reason: collision with root package name */
    public int f31629e;

    /* renamed from: f, reason: collision with root package name */
    public c f31630f;

    /* renamed from: g, reason: collision with root package name */
    public LayoutInflater f31631g;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public ColorStateList f31633i;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f31636l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f31637m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f31638n;

    /* renamed from: o, reason: collision with root package name */
    public RippleDrawable f31639o;

    /* renamed from: p, reason: collision with root package name */
    public int f31640p;

    /* renamed from: q, reason: collision with root package name */
    @Px
    public int f31641q;

    /* renamed from: r, reason: collision with root package name */
    public int f31642r;

    /* renamed from: s, reason: collision with root package name */
    public int f31643s;

    /* renamed from: t, reason: collision with root package name */
    @Px
    public int f31644t;

    /* renamed from: u, reason: collision with root package name */
    @Px
    public int f31645u;

    /* renamed from: v, reason: collision with root package name */
    @Px
    public int f31646v;

    /* renamed from: w, reason: collision with root package name */
    @Px
    public int f31647w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f31648x;

    /* renamed from: z, reason: collision with root package name */
    public int f31650z;

    /* renamed from: h, reason: collision with root package name */
    public int f31632h = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f31634j = 0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f31635k = true;

    /* renamed from: y, reason: collision with root package name */
    public boolean f31649y = true;
    public int C = -1;
    public final View.OnClickListener D = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z11 = true;
            t.this.Q(true);
            MenuItemImpl itemData = ((NavigationMenuItemView) view).getItemData();
            t tVar = t.this;
            boolean performItemAction = tVar.f31628d.performItemAction(itemData, tVar, 0);
            if (itemData != null && itemData.isCheckable() && performItemAction) {
                t.this.f31630f.o(itemData);
            } else {
                z11 = false;
            }
            t.this.Q(false);
            if (z11) {
                t.this.updateMenuView(false);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends l {
        public b(View view) {
            super(view);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends RecyclerView.Adapter<l> {

        /* renamed from: e, reason: collision with root package name */
        public static final String f31652e = "android:menu:checked";

        /* renamed from: f, reason: collision with root package name */
        public static final String f31653f = "android:menu:action_views";

        /* renamed from: g, reason: collision with root package name */
        public static final int f31654g = 0;

        /* renamed from: h, reason: collision with root package name */
        public static final int f31655h = 1;

        /* renamed from: i, reason: collision with root package name */
        public static final int f31656i = 2;

        /* renamed from: j, reason: collision with root package name */
        public static final int f31657j = 3;

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList<e> f31658a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        public MenuItemImpl f31659b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f31660c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends AccessibilityDelegateCompat {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f31662a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f31663b;

            public a(int i11, boolean z11) {
                this.f31662a = i11;
                this.f31663b = z11;
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(c.this.c(this.f31662a), 1, 1, 1, this.f31663b, view.isSelected()));
            }
        }

        public c() {
            l();
        }

        public final int c(int i11) {
            int i12 = i11;
            for (int i13 = 0; i13 < i11; i13++) {
                if (t.this.f31630f.getItemViewType(i13) == 2 || t.this.f31630f.getItemViewType(i13) == 3) {
                    i12--;
                }
            }
            return i12;
        }

        public final void d(int i11, int i12) {
            while (i11 < i12) {
                ((g) this.f31658a.get(i11)).f31668b = true;
                i11++;
            }
        }

        @NonNull
        public Bundle f() {
            Bundle bundle = new Bundle();
            MenuItemImpl menuItemImpl = this.f31659b;
            if (menuItemImpl != null) {
                bundle.putInt(f31652e, menuItemImpl.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f31658a.size();
            for (int i11 = 0; i11 < size; i11++) {
                e eVar = this.f31658a.get(i11);
                if (eVar instanceof g) {
                    MenuItemImpl a11 = ((g) eVar).a();
                    View actionView = a11 != null ? a11.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(a11.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray(f31653f, sparseArray);
            return bundle;
        }

        public MenuItemImpl g() {
            return this.f31659b;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f31658a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i11) {
            return i11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i11) {
            e eVar = this.f31658a.get(i11);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                return ((g) eVar).a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        public int h() {
            int i11 = 0;
            for (int i12 = 0; i12 < t.this.f31630f.getItemCount(); i12++) {
                int itemViewType = t.this.f31630f.getItemViewType(i12);
                if (itemViewType == 0 || itemViewType == 1) {
                    i11++;
                }
            }
            return i11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull l lVar, int i11) {
            int itemViewType = getItemViewType(i11);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        return;
                    }
                    f fVar = (f) this.f31658a.get(i11);
                    lVar.itemView.setPadding(t.this.f31644t, fVar.b(), t.this.f31645u, fVar.a());
                    return;
                }
                TextView textView = (TextView) lVar.itemView;
                textView.setText(((g) this.f31658a.get(i11)).a().getTitle());
                TextViewCompat.setTextAppearance(textView, t.this.f31632h);
                textView.setPadding(t.this.f31646v, textView.getPaddingTop(), t.this.f31647w, textView.getPaddingBottom());
                ColorStateList colorStateList = t.this.f31633i;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                n(textView, i11, true);
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.itemView;
            navigationMenuItemView.setIconTintList(t.this.f31637m);
            navigationMenuItemView.setTextAppearance(t.this.f31634j);
            ColorStateList colorStateList2 = t.this.f31636l;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = t.this.f31638n;
            ViewCompat.setBackground(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
            RippleDrawable rippleDrawable = t.this.f31639o;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            g gVar = (g) this.f31658a.get(i11);
            navigationMenuItemView.setNeedsEmptyIcon(gVar.f31668b);
            t tVar = t.this;
            int i12 = tVar.f31640p;
            int i13 = tVar.f31641q;
            navigationMenuItemView.setPadding(i12, i13, i12, i13);
            navigationMenuItemView.setIconPadding(t.this.f31642r);
            t tVar2 = t.this;
            if (tVar2.f31648x) {
                navigationMenuItemView.setIconSize(tVar2.f31643s);
            }
            navigationMenuItemView.setMaxLines(t.this.f31650z);
            navigationMenuItemView.c(gVar.a(), t.this.f31635k);
            n(navigationMenuItemView, i11, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @Nullable
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public l onCreateViewHolder(ViewGroup viewGroup, int i11) {
            if (i11 == 0) {
                t tVar = t.this;
                return new i(tVar.f31631g, viewGroup, tVar.D);
            }
            if (i11 == 1) {
                return new k(t.this.f31631g, viewGroup);
            }
            if (i11 == 2) {
                return new j(t.this.f31631g, viewGroup);
            }
            if (i11 != 3) {
                return null;
            }
            return new b(t.this.f31626b);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void onViewRecycled(l lVar) {
            if (lVar instanceof i) {
                ((NavigationMenuItemView) lVar.itemView).d();
            }
        }

        public final void l() {
            if (this.f31660c) {
                return;
            }
            boolean z11 = true;
            this.f31660c = true;
            this.f31658a.clear();
            this.f31658a.add(new d());
            int size = t.this.f31628d.getVisibleItems().size();
            int i11 = -1;
            int i12 = 0;
            boolean z12 = false;
            int i13 = 0;
            while (i12 < size) {
                MenuItemImpl menuItemImpl = t.this.f31628d.getVisibleItems().get(i12);
                if (menuItemImpl.isChecked()) {
                    o(menuItemImpl);
                }
                if (menuItemImpl.isCheckable()) {
                    menuItemImpl.setExclusiveCheckable(false);
                }
                if (menuItemImpl.hasSubMenu()) {
                    SubMenu subMenu = menuItemImpl.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i12 != 0) {
                            this.f31658a.add(new f(t.this.B, 0));
                        }
                        this.f31658a.add(new g(menuItemImpl));
                        int size2 = this.f31658a.size();
                        int size3 = subMenu.size();
                        int i14 = 0;
                        boolean z13 = false;
                        while (i14 < size3) {
                            MenuItemImpl menuItemImpl2 = (MenuItemImpl) subMenu.getItem(i14);
                            if (menuItemImpl2.isVisible()) {
                                if (!z13 && menuItemImpl2.getIcon() != null) {
                                    z13 = z11;
                                }
                                if (menuItemImpl2.isCheckable()) {
                                    menuItemImpl2.setExclusiveCheckable(false);
                                }
                                if (menuItemImpl.isChecked()) {
                                    o(menuItemImpl);
                                }
                                this.f31658a.add(new g(menuItemImpl2));
                            }
                            i14++;
                            z11 = true;
                        }
                        if (z13) {
                            d(size2, this.f31658a.size());
                        }
                    }
                } else {
                    int groupId = menuItemImpl.getGroupId();
                    if (groupId != i11) {
                        i13 = this.f31658a.size();
                        z12 = menuItemImpl.getIcon() != null;
                        if (i12 != 0) {
                            i13++;
                            ArrayList<e> arrayList = this.f31658a;
                            int i15 = t.this.B;
                            arrayList.add(new f(i15, i15));
                        }
                    } else if (!z12 && menuItemImpl.getIcon() != null) {
                        d(i13, this.f31658a.size());
                        z12 = true;
                    }
                    g gVar = new g(menuItemImpl);
                    gVar.f31668b = z12;
                    this.f31658a.add(gVar);
                    i11 = groupId;
                }
                i12++;
                z11 = true;
            }
            this.f31660c = false;
        }

        public void m(@NonNull Bundle bundle) {
            MenuItemImpl a11;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            MenuItemImpl a12;
            int i11 = bundle.getInt(f31652e, 0);
            if (i11 != 0) {
                this.f31660c = true;
                int size = this.f31658a.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    e eVar = this.f31658a.get(i12);
                    if ((eVar instanceof g) && (a12 = ((g) eVar).a()) != null && a12.getItemId() == i11) {
                        o(a12);
                        break;
                    }
                    i12++;
                }
                this.f31660c = false;
                l();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(f31653f);
            if (sparseParcelableArray != null) {
                int size2 = this.f31658a.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    e eVar2 = this.f31658a.get(i13);
                    if ((eVar2 instanceof g) && (a11 = ((g) eVar2).a()) != null && (actionView = a11.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(a11.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public final void n(View view, int i11, boolean z11) {
            ViewCompat.setAccessibilityDelegate(view, new a(i11, z11));
        }

        public void o(@NonNull MenuItemImpl menuItemImpl) {
            if (this.f31659b == menuItemImpl || !menuItemImpl.isCheckable()) {
                return;
            }
            MenuItemImpl menuItemImpl2 = this.f31659b;
            if (menuItemImpl2 != null) {
                menuItemImpl2.setChecked(false);
            }
            this.f31659b = menuItemImpl;
            menuItemImpl.setChecked(true);
        }

        public void p(boolean z11) {
            this.f31660c = z11;
        }

        public void q() {
            l();
            notifyDataSetChanged();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements e {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface e {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f implements e {

        /* renamed from: a, reason: collision with root package name */
        public final int f31665a;

        /* renamed from: b, reason: collision with root package name */
        public final int f31666b;

        public f(int i11, int i12) {
            this.f31665a = i11;
            this.f31666b = i12;
        }

        public int a() {
            return this.f31666b;
        }

        public int b() {
            return this.f31665a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g implements e {

        /* renamed from: a, reason: collision with root package name */
        public final MenuItemImpl f31667a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f31668b;

        public g(MenuItemImpl menuItemImpl) {
            this.f31667a = menuItemImpl;
        }

        public MenuItemImpl a() {
            return this.f31667a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h extends RecyclerViewAccessibilityDelegate {
        public h(@NonNull RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate, androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(t.this.f31630f.h(), 1, false));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i extends l {
        public i(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class j extends l {
        public j(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class k extends l {
        public k(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class l extends RecyclerView.ViewHolder {
        public l(View view) {
            super(view);
        }
    }

    public void A(@Nullable Drawable drawable) {
        this.f31638n = drawable;
        updateMenuView(false);
    }

    public void B(@Nullable RippleDrawable rippleDrawable) {
        this.f31639o = rippleDrawable;
        updateMenuView(false);
    }

    public void C(int i11) {
        this.f31640p = i11;
        updateMenuView(false);
    }

    public void D(int i11) {
        this.f31642r = i11;
        updateMenuView(false);
    }

    public void E(@Dimension int i11) {
        if (this.f31643s != i11) {
            this.f31643s = i11;
            this.f31648x = true;
            updateMenuView(false);
        }
    }

    public void F(@Nullable ColorStateList colorStateList) {
        this.f31637m = colorStateList;
        updateMenuView(false);
    }

    public void G(int i11) {
        this.f31650z = i11;
        updateMenuView(false);
    }

    public void H(@StyleRes int i11) {
        this.f31634j = i11;
        updateMenuView(false);
    }

    public void I(boolean z11) {
        this.f31635k = z11;
        updateMenuView(false);
    }

    public void J(@Nullable ColorStateList colorStateList) {
        this.f31636l = colorStateList;
        updateMenuView(false);
    }

    public void K(@Px int i11) {
        this.f31641q = i11;
        updateMenuView(false);
    }

    public void L(int i11) {
        this.C = i11;
        NavigationMenuView navigationMenuView = this.f31625a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i11);
        }
    }

    public void M(@Nullable ColorStateList colorStateList) {
        this.f31633i = colorStateList;
        updateMenuView(false);
    }

    public void N(@Px int i11) {
        this.f31647w = i11;
        updateMenuView(false);
    }

    public void O(@Px int i11) {
        this.f31646v = i11;
        updateMenuView(false);
    }

    public void P(@StyleRes int i11) {
        this.f31632h = i11;
        updateMenuView(false);
    }

    public void Q(boolean z11) {
        c cVar = this.f31630f;
        if (cVar != null) {
            cVar.p(z11);
        }
    }

    public final void R() {
        int i11 = (r() || !this.f31649y) ? 0 : this.A;
        NavigationMenuView navigationMenuView = this.f31625a;
        navigationMenuView.setPadding(0, i11, 0, navigationMenuView.getPaddingBottom());
    }

    public void b(@NonNull View view) {
        this.f31626b.addView(view);
        NavigationMenuView navigationMenuView = this.f31625a;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    public void c(@NonNull WindowInsetsCompat windowInsetsCompat) {
        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        if (this.A != systemWindowInsetTop) {
            this.A = systemWindowInsetTop;
            R();
        }
        NavigationMenuView navigationMenuView = this.f31625a;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, windowInsetsCompat.getSystemWindowInsetBottom());
        ViewCompat.dispatchApplyWindowInsets(this.f31626b, windowInsetsCompat);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Nullable
    public MenuItemImpl d() {
        return this.f31630f.g();
    }

    @Px
    public int e() {
        return this.f31645u;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Px
    public int f() {
        return this.f31644t;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
        return false;
    }

    public int g() {
        return this.f31626b.getChildCount();
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return this.f31629e;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public MenuView getMenuView(ViewGroup viewGroup) {
        if (this.f31625a == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f31631g.inflate(R.layout.design_navigation_menu, viewGroup, false);
            this.f31625a = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new h(this.f31625a));
            if (this.f31630f == null) {
                c cVar = new c();
                this.f31630f = cVar;
                cVar.setHasStableIds(true);
            }
            int i11 = this.C;
            if (i11 != -1) {
                this.f31625a.setOverScrollMode(i11);
            }
            LinearLayout linearLayout = (LinearLayout) this.f31631g.inflate(R.layout.design_navigation_item_header, (ViewGroup) this.f31625a, false);
            this.f31626b = linearLayout;
            ViewCompat.setImportantForAccessibility(linearLayout, 2);
            this.f31625a.setAdapter(this.f31630f);
        }
        return this.f31625a;
    }

    public View h(int i11) {
        return this.f31626b.getChildAt(i11);
    }

    @Nullable
    public Drawable i() {
        return this.f31638n;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(@NonNull Context context, @NonNull MenuBuilder menuBuilder) {
        this.f31631g = LayoutInflater.from(context);
        this.f31628d = menuBuilder;
        this.B = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    public int j() {
        return this.f31640p;
    }

    public int k() {
        return this.f31642r;
    }

    public int l() {
        return this.f31650z;
    }

    @Nullable
    public ColorStateList m() {
        return this.f31636l;
    }

    @Nullable
    public ColorStateList n() {
        return this.f31637m;
    }

    @Px
    public int o() {
        return this.f31641q;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z11) {
        MenuPresenter.Callback callback = this.f31627c;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, z11);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f31625a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle(G);
            if (bundle2 != null) {
                this.f31630f.m(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray(H);
            if (sparseParcelableArray2 != null) {
                this.f31626b.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    @NonNull
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        if (this.f31625a != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f31625a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.f31630f;
        if (cVar != null) {
            bundle.putBundle(G, cVar.f());
        }
        if (this.f31626b != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.f31626b.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray(H, sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    @Px
    public int p() {
        return this.f31647w;
    }

    @Px
    public int q() {
        return this.f31646v;
    }

    public final boolean r() {
        return g() > 0;
    }

    public View s(@LayoutRes int i11) {
        View inflate = this.f31631g.inflate(i11, (ViewGroup) this.f31626b, false);
        b(inflate);
        return inflate;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(MenuPresenter.Callback callback) {
        this.f31627c = callback;
    }

    public boolean t() {
        return this.f31649y;
    }

    public void u(@NonNull View view) {
        this.f31626b.removeView(view);
        if (r()) {
            return;
        }
        NavigationMenuView navigationMenuView = this.f31625a;
        navigationMenuView.setPadding(0, this.A, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z11) {
        c cVar = this.f31630f;
        if (cVar != null) {
            cVar.q();
        }
    }

    public void v(boolean z11) {
        if (this.f31649y != z11) {
            this.f31649y = z11;
            R();
        }
    }

    public void w(@NonNull MenuItemImpl menuItemImpl) {
        this.f31630f.o(menuItemImpl);
    }

    public void x(@Px int i11) {
        this.f31645u = i11;
        updateMenuView(false);
    }

    public void y(@Px int i11) {
        this.f31644t = i11;
        updateMenuView(false);
    }

    public void z(int i11) {
        this.f31629e = i11;
    }
}
