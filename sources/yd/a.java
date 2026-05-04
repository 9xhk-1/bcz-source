package yd;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.baicizhan.client.business.auth.share.ShareDelegate;
import com.baicizhan.main.customview.NumberView;
import com.jiongji.andriod.card.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a implements ShareDelegate.a {

    /* renamed from: e, reason: collision with root package name */
    public static final int f99872e = 800;

    /* renamed from: f, reason: collision with root package name */
    public static final int f99873f = 1280;

    /* renamed from: a, reason: collision with root package name */
    public Object f99874a;

    /* renamed from: b, reason: collision with root package name */
    public int f99875b;

    /* renamed from: c, reason: collision with root package name */
    public int f99876c;

    /* renamed from: d, reason: collision with root package name */
    public String f99877d;

    public a(Object avator, int dakaDay, int studywords, String name) {
        this.f99874a = avator;
        this.f99875b = dakaDay;
        this.f99876c = studywords;
        this.f99877d = name;
    }

    @Override // com.baicizhan.client.business.auth.share.ShareDelegate.a
    public Bitmap a(Bitmap bitmap, Context context, boolean forThumb) {
        View inflate = LayoutInflater.from(context).inflate(forThumb ? R.layout.daka_share_thumb_process : R.layout.daka_share_process, (ViewGroup) null, false);
        ((ImageView) inflate.findViewById(R.id.background)).setImageBitmap(bitmap);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.avatar);
        TextView textView = (TextView) inflate.findViewById(R.id.date);
        TextView textView2 = (TextView) inflate.findViewById(R.id.name);
        NumberView numberView = (NumberView) inflate.findViewById(R.id.study_words);
        NumberView numberView2 = (NumberView) inflate.findViewById(R.id.daka_days);
        Object obj = this.f99874a;
        if (obj instanceof Bitmap) {
            imageView.setImageBitmap((Bitmap) obj);
        } else if (obj instanceof Drawable) {
            imageView.setImageDrawable((Drawable) obj);
        }
        textView2.setText(this.f99877d);
        numberView.setNumber(this.f99876c);
        numberView2.setNumber(this.f99875b);
        textView.setText(new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(new Date()));
        int i11 = forThumb ? 200 : 800;
        int i12 = forThumb ? MediaSessionCompat.K : 1280;
        inflate.measure(0, 0);
        inflate.layout(0, 0, i11, i12);
        Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(0);
        inflate.draw(new Canvas(createBitmap));
        return createBitmap;
    }
}
