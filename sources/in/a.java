package in;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Dialog f60713a;

    /* renamed from: b, reason: collision with root package name */
    public final int f60714b;

    /* renamed from: c, reason: collision with root package name */
    public final int f60715c;

    /* renamed from: d, reason: collision with root package name */
    public final int f60716d;

    public a(@NonNull Dialog dialog, @NonNull Rect rect) {
        this.f60713a = dialog;
        this.f60714b = rect.left;
        this.f60715c = rect.top;
        this.f60716d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = this.f60714b + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        if (new RectF(left, this.f60715c + findViewById.getTop(), width, findViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i11 = this.f60716d;
            obtain.setLocation((-i11) - 1, (-i11) - 1);
        }
        view.performClick();
        return this.f60713a.onTouchEvent(obtain);
    }
}
