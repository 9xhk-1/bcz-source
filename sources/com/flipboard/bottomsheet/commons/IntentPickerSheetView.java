package com.flipboard.bottomsheet.commons;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.core.view.ViewCompat;
import com.flipboard.bottomsheet.commons.d;
import flipboard.bottomsheet.commons.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public class IntentPickerSheetView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public int f29548a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f29549b;

    /* renamed from: c, reason: collision with root package name */
    public final GridView f29550c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f29551d;

    /* renamed from: e, reason: collision with root package name */
    public final List<b> f29552e;

    /* renamed from: f, reason: collision with root package name */
    public c f29553f;

    /* renamed from: g, reason: collision with root package name */
    public d f29554g;

    /* renamed from: h, reason: collision with root package name */
    public Comparator<b> f29555h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f29556a;

        public a(final f val$listener) {
            this.f29556a = val$listener;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> parent, View view, int position, long id2) {
            this.f29556a.onIntentPicked(IntentPickerSheetView.this.f29553f.getItem(position));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends BaseAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final List<b> f29564a;

        /* renamed from: b, reason: collision with root package name */
        public final LayoutInflater f29565b;

        /* renamed from: c, reason: collision with root package name */
        public PackageManager f29566c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends AsyncTask<Void, Void, Drawable> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f29568a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f29569b;

            public a(final b val$info, final b val$holder) {
                this.f29568a = val$info;
                this.f29569b = val$holder;
            }

            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Drawable doInBackground(@NonNull Void... params) {
                return this.f29568a.f29561d.loadIcon(c.this.f29566c);
            }

            @Override // android.os.AsyncTask
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(@NonNull Drawable drawable) {
                b bVar = this.f29568a;
                bVar.f29558a = drawable;
                bVar.f29562e = null;
                this.f29569b.f29571a.setImageDrawable(drawable);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b {

            /* renamed from: a, reason: collision with root package name */
            public final ImageView f29571a;

            /* renamed from: b, reason: collision with root package name */
            public final TextView f29572b;

            public b(View root) {
                this.f29571a = (ImageView) root.findViewById(R.id.icon);
                this.f29572b = (TextView) root.findViewById(R.id.label);
            }
        }

        public c(Context context, Intent intent, List<b> mixins) {
            this.f29565b = LayoutInflater.from(context);
            PackageManager packageManager = context.getPackageManager();
            this.f29566c = packageManager;
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList(queryIntentActivities.size() + mixins.size());
            this.f29564a = arrayList;
            arrayList.addAll(mixins);
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                b bVar = new b(resolveInfo, resolveInfo.loadLabel(this.f29566c), new ComponentName(activityInfo.packageName, activityInfo.name));
                if (IntentPickerSheetView.this.f29554g.include(bVar)) {
                    this.f29564a.add(bVar);
                }
            }
            Collections.sort(this.f29564a, IntentPickerSheetView.this.f29555h);
        }

        @Override // android.widget.Adapter
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public b getItem(int position) {
            return this.f29564a.get(position);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f29564a.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            return this.f29564a.get(position).f29560c.hashCode();
        }

        @Override // android.widget.Adapter
        public View getView(int position, View convertView, ViewGroup parent) {
            b bVar;
            if (convertView == null) {
                convertView = this.f29565b.inflate(R.layout.sheet_grid_item, parent, false);
                bVar = new b(convertView);
                convertView.setTag(bVar);
            } else {
                bVar = (b) convertView.getTag();
            }
            b bVar2 = this.f29564a.get(position);
            if (bVar2.f29562e != null) {
                bVar2.f29562e.cancel(true);
                bVar2.f29562e = null;
            }
            Drawable drawable = bVar2.f29558a;
            if (drawable != null) {
                bVar.f29571a.setImageDrawable(drawable);
            } else {
                bVar.f29571a.setImageDrawable(IntentPickerSheetView.this.getResources().getDrawable(R.color.divider_gray));
                bVar2.f29562e = new a(bVar2, bVar);
                bVar2.f29562e.execute(new Void[0]);
            }
            bVar.f29572b.setText(bVar2.f29559b);
            return convertView;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d {
        boolean include(b info);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements d {
        public e() {
        }

        @Override // com.flipboard.bottomsheet.commons.IntentPickerSheetView.d
        public boolean include(b info) {
            return true;
        }

        public /* synthetic */ e(IntentPickerSheetView intentPickerSheetView, a aVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface f {
        void onIntentPicked(b activityInfo);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g implements Comparator<b> {
        public g() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b lhs, b rhs) {
            return lhs.f29559b.compareTo(rhs.f29559b);
        }

        public /* synthetic */ g(IntentPickerSheetView intentPickerSheetView, a aVar) {
            this();
        }
    }

    public IntentPickerSheetView(Context context, Intent intent, @StringRes int titleRes, f listener) {
        this(context, intent, context.getString(titleRes), listener);
    }

    public List<b> getMixins() {
        return this.f29552e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c cVar = new c(getContext(), this.f29549b, this.f29552e);
        this.f29553f = cVar;
        this.f29550c.setAdapter((ListAdapter) cVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (b bVar : this.f29553f.f29564a) {
            if (bVar.f29562e != null) {
                bVar.f29562e.cancel(true);
                bVar.f29562e = null;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        float f11 = getResources().getDisplayMetrics().density;
        getResources().getDimensionPixelSize(R.dimen.bottomsheet_default_sheet_width);
        this.f29550c.setNumColumns((int) (size / (this.f29548a * f11)));
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // android.view.View
    public void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        setOutlineProvider(new d.a(w11, h11));
    }

    public void setColumnWidthDp(int columnWidthDp) {
        this.f29548a = columnWidthDp;
    }

    public void setFilter(d filter) {
        this.f29554g = filter;
    }

    public void setMixins(@NonNull List<b> infos) {
        this.f29552e.clear();
        this.f29552e.addAll(infos);
    }

    public void setSortMethod(Comparator<b> sortMethod) {
        this.f29555h = sortMethod;
    }

    public IntentPickerSheetView(Context context, final Intent intent, final String title, final f listener) {
        super(context);
        this.f29548a = 100;
        this.f29552e = new ArrayList();
        a aVar = null;
        this.f29554g = new e(this, aVar);
        this.f29555h = new g(this, aVar);
        this.f29549b = intent;
        View.inflate(context, R.layout.grid_sheet_view, this);
        GridView gridView = (GridView) findViewById(R.id.grid);
        this.f29550c = gridView;
        TextView textView = (TextView) findViewById(R.id.title);
        this.f29551d = textView;
        textView.setText(title);
        gridView.setOnItemClickListener(new a(listener));
        ViewCompat.setElevation(this, com.flipboard.bottomsheet.commons.d.a(getContext(), 16.0f));
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public Drawable f29558a;

        /* renamed from: b, reason: collision with root package name */
        public final String f29559b;

        /* renamed from: c, reason: collision with root package name */
        public final ComponentName f29560c;

        /* renamed from: d, reason: collision with root package name */
        public final ResolveInfo f29561d;

        /* renamed from: e, reason: collision with root package name */
        public AsyncTask<Void, Void, Drawable> f29562e;

        /* renamed from: f, reason: collision with root package name */
        public Object f29563f;

        public b(Drawable icon, String label, Context context, Class<?> clazz) {
            this.f29558a = icon;
            this.f29561d = null;
            this.f29559b = label;
            this.f29560c = new ComponentName(context, clazz.getName());
        }

        public Intent c(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f29560c);
            return intent2;
        }

        public b(ResolveInfo resolveInfo, CharSequence label, ComponentName componentName) {
            this.f29561d = resolveInfo;
            this.f29559b = label.toString();
            this.f29560c = componentName;
        }
    }
}
