package com.flipboard.bottomsheet.commons;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
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
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import com.flipboard.bottomsheet.commons.d;
import flipboard.bottomsheet.commons.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public class ImagePickerSheetView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f29514a;

    /* renamed from: b, reason: collision with root package name */
    public final GridView f29515b;

    /* renamed from: c, reason: collision with root package name */
    public b f29516c;

    /* renamed from: d, reason: collision with root package name */
    public int f29517d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29518e;

    /* renamed from: f, reason: collision with root package name */
    public final int f29519f;

    /* renamed from: g, reason: collision with root package name */
    public int f29520g;

    /* renamed from: h, reason: collision with root package name */
    public e f29521h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f29522i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f29523j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f29524k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f29525l;

    /* renamed from: m, reason: collision with root package name */
    public String f29526m;

    /* renamed from: n, reason: collision with root package name */
    public int f29527n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f29528a;

        public a(final c val$builder) {
            this.f29528a = val$builder;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(@NonNull AdapterView<?> parent, @NonNull View view, int position, long id2) {
            this.f29528a.f29537d.a(ImagePickerSheetView.this.f29516c.getItem(position));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends BaseAdapter {

        /* renamed from: a, reason: collision with root package name */
        public List<d> f29530a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final LayoutInflater f29531b;

        /* renamed from: c, reason: collision with root package name */
        public final ContentResolver f29532c;

        public b(Context context) {
            this.f29531b = LayoutInflater.from(context);
            if (ImagePickerSheetView.this.f29522i) {
                this.f29530a.add(new d(2));
            }
            if (ImagePickerSheetView.this.f29523j) {
                this.f29530a.add(new d(3));
            }
            ContentResolver contentResolver = context.getContentResolver();
            this.f29532c = contentResolver;
            Cursor query = contentResolver.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "bucket_display_name", "datetaken", "mime_type"}, null, null, "datetaken DESC");
            if (query != null) {
                for (int i11 = 0; query.moveToNext() && i11 < ImagePickerSheetView.this.f29520g; i11++) {
                    File file = new File(query.getString(1));
                    if (file.exists()) {
                        this.f29530a.add(new d(Uri.fromFile(file)));
                    }
                }
                query.close();
            }
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d getItem(int position) {
            return this.f29530a.get(position);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f29530a.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            return position;
        }

        @Override // android.widget.Adapter
        public View getView(int position, View recycled, @NonNull ViewGroup parent) {
            ImageView imageView = recycled == null ? (ImageView) this.f29531b.inflate(R.layout.sheet_image_grid_item, parent, false) : (ImageView) recycled;
            d dVar = this.f29530a.get(position);
            imageView.setMinimumWidth(ImagePickerSheetView.this.f29517d);
            imageView.setMinimumHeight(ImagePickerSheetView.this.f29517d);
            imageView.setMaxHeight(ImagePickerSheetView.this.f29517d);
            imageView.setMaxWidth(ImagePickerSheetView.this.f29517d);
            Uri uri = dVar.f29546a;
            if (uri != null) {
                ImagePickerSheetView imagePickerSheetView = ImagePickerSheetView.this;
                imagePickerSheetView.f29521h.a(imageView, uri, imagePickerSheetView.f29517d);
                return imageView;
            }
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            if (dVar.c()) {
                imageView.setBackgroundResource(android.R.color.black);
                Drawable drawable = ImagePickerSheetView.this.f29524k;
                if (drawable == null) {
                    imageView.setImageResource(R.drawable.bottomsheet_camera);
                    return imageView;
                }
                imageView.setImageDrawable(drawable);
                return imageView;
            }
            if (dVar.e()) {
                imageView.setBackgroundResource(android.R.color.darker_gray);
                Drawable drawable2 = ImagePickerSheetView.this.f29525l;
                if (drawable2 == null) {
                    imageView.setImageResource(R.drawable.bottomsheet_collections);
                    return imageView;
                }
                imageView.setImageDrawable(drawable2);
            }
            return imageView;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public Context f29534a;

        /* renamed from: d, reason: collision with root package name */
        public f f29537d;

        /* renamed from: e, reason: collision with root package name */
        public e f29538e;

        /* renamed from: b, reason: collision with root package name */
        public int f29535b = 25;

        /* renamed from: c, reason: collision with root package name */
        public String f29536c = null;

        /* renamed from: f, reason: collision with root package name */
        public boolean f29539f = true;

        /* renamed from: g, reason: collision with root package name */
        public boolean f29540g = true;

        /* renamed from: h, reason: collision with root package name */
        public Drawable f29541h = null;

        /* renamed from: i, reason: collision with root package name */
        public Drawable f29542i = null;

        public c(@NonNull Context context) {
            this.f29534a = context;
        }

        @CheckResult
        public ImagePickerSheetView a() {
            if (this.f29538e != null) {
                return new ImagePickerSheetView(this);
            }
            throw new IllegalStateException("Must provide an ImageProvider!");
        }

        public c b(@DrawableRes int resId) {
            return c(ResourcesCompat.getDrawable(this.f29534a.getResources(), resId, null));
        }

        public c c(@Nullable Drawable cameraDrawable) {
            this.f29541h = cameraDrawable;
            return this;
        }

        public c d(e imageProvider) {
            this.f29538e = imageProvider;
            return this;
        }

        public c e(int maxItems) {
            this.f29535b = maxItems;
            return this;
        }

        public c f(f onTileSelectedListener) {
            this.f29537d = onTileSelectedListener;
            return this;
        }

        public c g(@DrawableRes int resId) {
            return h(ResourcesCompat.getDrawable(this.f29534a.getResources(), resId, null));
        }

        public c h(Drawable pickerDrawable) {
            this.f29542i = pickerDrawable;
            return this;
        }

        public c i(boolean showCameraOption) {
            this.f29539f = showCameraOption;
            return this;
        }

        public c j(boolean showPickerOption) {
            this.f29540g = showPickerOption;
            return this;
        }

        public c k(@StringRes int title) {
            return l(this.f29534a.getString(title));
        }

        public c l(@Nullable String title) {
            this.f29536c = title;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {

        /* renamed from: c, reason: collision with root package name */
        public static final int f29543c = 1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f29544d = 2;

        /* renamed from: e, reason: collision with root package name */
        public static final int f29545e = 3;

        /* renamed from: a, reason: collision with root package name */
        public final Uri f29546a;

        /* renamed from: b, reason: collision with root package name */
        @b
        public final int f29547b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public @interface a {
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public @interface b {
        }

        public d(@a int tileType) {
            this(null, tileType);
        }

        @Nullable
        public Uri a() {
            return this.f29546a;
        }

        @b
        public int b() {
            return this.f29547b;
        }

        public boolean c() {
            return this.f29547b == 2;
        }

        public boolean d() {
            return this.f29547b == 1;
        }

        public boolean e() {
            return this.f29547b == 3;
        }

        public String toString() {
            if (!d()) {
                return c() ? "CameraTile" : e() ? "PickerTile" : "Invalid item";
            }
            return "ImageTile: " + this.f29546a;
        }

        public d(@NonNull Uri imageUri) {
            this(imageUri, 1);
        }

        public d(@Nullable Uri imageUri, @b int tileType) {
            this.f29546a = imageUri;
            this.f29547b = tileType;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface e {
        void a(ImageView imageView, Uri imageUri, int size);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface f {
        void a(d selectedTile);
    }

    public ImagePickerSheetView(final c builder) {
        super(builder.f29534a);
        this.f29520g = 25;
        this.f29522i = true;
        this.f29523j = true;
        this.f29524k = null;
        this.f29525l = null;
        this.f29527n = 100;
        View.inflate(getContext(), R.layout.grid_sheet_view, this);
        GridView gridView = (GridView) findViewById(R.id.grid);
        this.f29515b = gridView;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.bottomsheet_image_tile_spacing);
        this.f29518e = dimensionPixelSize;
        gridView.setDrawSelectorOnTop(true);
        gridView.setVerticalSpacing(dimensionPixelSize);
        gridView.setHorizontalSpacing(dimensionPixelSize);
        gridView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        this.f29514a = (TextView) findViewById(R.id.title);
        this.f29519f = gridView.getPaddingTop();
        setTitle(builder.f29536c);
        if (builder.f29537d != null) {
            gridView.setOnItemClickListener(new a(builder));
        }
        this.f29520g = builder.f29535b;
        this.f29521h = builder.f29538e;
        this.f29522i = builder.f29539f;
        this.f29523j = builder.f29540g;
        this.f29524k = builder.f29541h;
        this.f29525l = builder.f29542i;
        ViewCompat.setElevation(this, com.flipboard.bottomsheet.commons.d.a(getContext(), 16.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = new b(getContext());
        this.f29516c = bVar;
        this.f29515b.setAdapter((ListAdapter) bVar);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = (int) (View.MeasureSpec.getSize(widthMeasureSpec) / (this.f29527n * getResources().getDisplayMetrics().density));
        this.f29517d = Math.round((r0 - ((size - 1) * this.f29518e)) / 3.0f);
        this.f29515b.setNumColumns(size);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // android.view.View
    public void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        setOutlineProvider(new d.a(w11, h11));
    }

    public void setColumnWidthDp(int columnWidthDp) {
        this.f29527n = columnWidthDp;
    }

    public void setTitle(@StringRes int titleRes) {
        setTitle(getResources().getString(titleRes));
    }

    public void setTitle(String title) {
        this.f29526m = title;
        if (!TextUtils.isEmpty(title)) {
            this.f29514a.setText(title);
            return;
        }
        this.f29514a.setVisibility(8);
        GridView gridView = this.f29515b;
        gridView.setPadding(gridView.getPaddingLeft(), this.f29519f + this.f29518e, this.f29515b.getPaddingRight(), this.f29515b.getPaddingBottom());
    }
}
