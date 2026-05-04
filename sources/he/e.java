package he;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.widget.ImageView;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.util.FileUtils;
import com.jiongji.andriod.card.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f59189a = "e";

    public static /* synthetic */ g2 a(final File file, final Bitmap bitmap) {
        AsyncTask.execute(new Runnable() { // from class: he.d
            @Override // java.lang.Runnable
            public final void run() {
                e.b(file, bitmap);
            }
        });
        return null;
    }

    public static /* synthetic */ void b(File file, Bitmap bitmap) {
        try {
            File file2 = new File(file.getAbsolutePath() + "_tmp");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            FileUtils.copyFile(file2, file);
            file2.delete();
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }

    public static File c(Context context) {
        String str;
        UserRecord p11 = q9.x.r().p();
        File filesDir = context.getFilesDir();
        if (p11 == null) {
            str = "";
        } else {
            str = p11.getUniqueId() + "_avatar.png";
        }
        return new File(filesDir, str);
    }

    public static void d(ImageView target, String url) {
        e(target, url, false);
    }

    public static void e(ImageView target, String url, boolean checkLocal) {
        final File c11 = c(target.getContext());
        Drawable drawable = target.getContext().getDrawable(R.drawable.defaultavatarbig_normal_default);
        if (c11.exists()) {
            drawable = new BitmapDrawable(target.getResources(), BitmapFactory.decodeFile(c11.getAbsolutePath()));
        }
        if (checkLocal && c11.exists()) {
            target.setImageURI(Uri.fromFile(c11));
            return;
        }
        qb.c.b(f59189a, "new avatar: " + c11.delete(), new Object[0]);
        hc.c.p(url).i(drawable).k(drawable).a(new x00.l() { // from class: he.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                return e.a(c11, (Bitmap) obj);
            }
        }, null, target);
    }

    public static void f(ImageView target) {
        File c11 = c(target.getContext());
        if (c11.exists()) {
            target.setImageURI(Uri.fromFile(c11));
        }
    }
}
