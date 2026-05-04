package com.baicizhan.main.wordlist.activity;

import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.jiongji.andriod.card.R;
import xb.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class SortWindow implements View.OnClickListener, PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public static SparseIntArray f27728d;

    /* renamed from: a, reason: collision with root package name */
    public PopupWindow f27729a;

    /* renamed from: b, reason: collision with root package name */
    public int f27730b;

    /* renamed from: c, reason: collision with root package name */
    public b f27731c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Strategy {
        Study(3, new int[]{R.string.word_list_sort_time_title, R.string.word_list_sort_wrong_title, R.string.word_list_sort_word_title, R.drawable.wrodslist_time_ascent_default, R.drawable.wrodslist_wrong_ascent_default, R.drawable.wrodslist_letter_ascent_default, R.drawable.wrodslist_time_descent_default, R.drawable.wrodslist_wrong_descent_default, R.drawable.wrodslist_letter_descent_default}),
        Killed(2, new int[]{R.string.word_list_sort_time_title, R.string.word_list_sort_word_title, R.drawable.wrodslist_time_ascent_default, R.drawable.wrodslist_letter_ascent_default, R.drawable.wrodslist_time_descent_default, R.drawable.wrodslist_letter_descent_default}),
        Unlearn(2, new int[]{R.drawable.wrodslist_roadmap_ascent_default, R.string.word_list_sort_road_map, R.drawable.wrodslist_letter_ascent_default, R.string.word_list_sort_word_asc, R.drawable.wrodslist_letter_descent_default, R.string.word_list_sort_word_desc});

        private final int mColumn;
        private final int[] mRes;

        Strategy(int column, int[] res) {
            this.mColumn = column;
            this.mRes = res;
        }

        public int getColumn() {
            return this.mColumn;
        }

        public int getRes(int idx) {
            int[] iArr = this.mRes;
            if (idx > iArr.length || idx < 0) {
                return 0;
            }
            return iArr[idx];
        }

        public boolean outOfLimit(int idx) {
            return this.mRes.length <= idx;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static SortWindow f27732a = new SortWindow();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void J();

        void O(int type);
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f27728d = sparseIntArray;
        sparseIntArray.put(2, R.drawable.wrodslist_time_ascent_default);
        f27728d.put(3, R.drawable.wrodslist_time_descent_default);
        f27728d.put(4, R.drawable.wrodslist_wrong_ascent_default);
        f27728d.put(5, R.drawable.wrodslist_wrong_descent_default);
        f27728d.put(6, R.drawable.wrodslist_letter_ascent_default);
        f27728d.put(7, R.drawable.wrodslist_letter_descent_default);
        f27728d.put(1, R.drawable.wrodslist_roadmap_ascent_default);
    }

    public static SortWindow d() {
        return a.f27732a;
    }

    public final void a(GridLayout view, Strategy strategy) {
        for (int i11 = 0; i11 < strategy.getColumn(); i11++) {
            TextView textView = new TextView(view.getContext());
            textView.setText(strategy.getRes(i11));
            textView.setTextColor(1728053247);
            textView.setTextSize(2, 12.0f);
            textView.setGravity(17);
            GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
            layoutParams.height = -2;
            layoutParams.width = i.a(view.getContext(), 40.0f);
            if (i11 != 0) {
                layoutParams.setMargins(i.a(view.getContext(), 8.0f), 0, 0, 0);
            }
            view.addView(textView, layoutParams);
        }
        for (int i12 = 1; i12 < 3; i12++) {
            for (int i13 = 0; i13 < strategy.getColumn() && !strategy.outOfLimit((strategy.getColumn() * i12) + i13); i13++) {
                int res = strategy.getRes((strategy.getColumn() * i12) + i13);
                ImageView imageView = new ImageView(view.getContext());
                imageView.setSelected(res == f27728d.get(this.f27730b));
                imageView.setBackgroundResource(res);
                imageView.setOnClickListener(this);
                imageView.setTag(Integer.valueOf(res));
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                GridLayout.LayoutParams layoutParams2 = new GridLayout.LayoutParams();
                layoutParams2.height = i.a(view.getContext(), 30.0f);
                layoutParams2.width = i.a(view.getContext(), 30.0f);
                if (i13 != 0) {
                    layoutParams2.setMargins(i.a(view.getContext(), 13.0f), i.a(view.getContext(), 8.0f), 0, 0);
                } else {
                    layoutParams2.setMargins(i.a(view.getContext(), 5.0f), i.a(view.getContext(), 8.0f), 0, 0);
                }
                view.addView(imageView, layoutParams2);
            }
        }
    }

    public final void b(GridLayout view, Strategy strategy) {
        if (strategy == Strategy.Unlearn) {
            c(view, strategy);
        } else {
            a(view, strategy);
        }
    }

    public final void c(GridLayout view, Strategy strategy) {
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= strategy.mRes.length) {
                return;
            }
            int res = strategy.getRes(i11);
            ImageView imageView = new ImageView(view.getContext());
            imageView.setSelected(res == f27728d.get(this.f27730b));
            imageView.setBackgroundResource(res);
            imageView.setOnClickListener(this);
            imageView.setTag(Integer.valueOf(res));
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
            layoutParams.height = i.a(view.getContext(), 30.0f);
            layoutParams.width = i.a(view.getContext(), 30.0f);
            view.addView(imageView, layoutParams);
            TextView textView = new TextView(view.getContext());
            textView.setText(strategy.getRes(i12));
            textView.setTag(Integer.valueOf(res));
            textView.setOnClickListener(this);
            textView.setTextColor(res == f27728d.get(this.f27730b) ? -11040257 : -1);
            textView.setTextSize(2, 12.0f);
            textView.setGravity(8388627);
            textView.setPadding(i.a(view.getContext(), 8.0f), 0, 0, 0);
            GridLayout.LayoutParams layoutParams2 = new GridLayout.LayoutParams();
            layoutParams2.height = i.a(view.getContext(), 30.0f);
            layoutParams2.width = -2;
            view.addView(textView, layoutParams2);
            i11 += 2;
        }
    }

    public void e() {
        PopupWindow popupWindow = this.f27729a;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public boolean f() {
        PopupWindow popupWindow = this.f27729a;
        if (popupWindow != null) {
            return popupWindow.isShowing();
        }
        return false;
    }

    public void g(b selectListener) {
        this.f27731c = selectListener;
    }

    public void h(View view, int sortType, Strategy strategy) {
        if (view == null || strategy == null) {
            return;
        }
        this.f27730b = sortType;
        GridLayout gridLayout = (GridLayout) LayoutInflater.from(view.getContext()).inflate(R.layout.wordlist_sort_window, (ViewGroup) null);
        gridLayout.setColumnCount(strategy.getColumn());
        b(gridLayout, strategy);
        PopupWindow popupWindow = this.f27729a;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f27729a.dismiss();
        }
        PopupWindow popupWindow2 = new PopupWindow(gridLayout, -2, -2);
        this.f27729a = popupWindow2;
        popupWindow2.setOutsideTouchable(true);
        this.f27729a.setBackgroundDrawable(view.getResources().getDrawable(R.drawable.word_list_sort_window_bg));
        this.f27729a.setOnDismissListener(this);
        this.f27729a.showAsDropDown(view, -i.a(view.getContext(), 74.0f), i.a(view.getContext(), 3.5f));
    }

    public void i(View view, Strategy strategy) {
        h(view, 3, strategy);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int indexOfValue;
        int keyAt;
        int intValue = ((Integer) view.getTag()).intValue();
        if (this.f27731c == null || (indexOfValue = f27728d.indexOfValue(intValue)) == -1 || (keyAt = f27728d.keyAt(indexOfValue)) == this.f27730b) {
            return;
        }
        this.f27731c.O(keyAt);
        e();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        b bVar = this.f27731c;
        if (bVar != null) {
            bVar.J();
        }
    }

    public SortWindow() {
        this.f27730b = 3;
    }
}
