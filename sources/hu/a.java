package hu;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import iu.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final gu.a f59787a;

    /* renamed from: b, reason: collision with root package name */
    public final b f59788b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f59789c;

    public a(b orientationProvider) {
        this(orientationProvider, new gu.a());
    }

    public void a(RecyclerView recyclerView, Canvas canvas, View header, Rect offset) {
        canvas.save();
        if (recyclerView.getLayoutManager().getClipToPadding()) {
            b(this.f59789c, recyclerView, header);
            canvas.clipRect(this.f59789c);
        }
        canvas.translate(offset.left, offset.top);
        header.draw(canvas);
        canvas.restore();
    }

    public final void b(Rect clipRect, RecyclerView recyclerView, View header) {
        this.f59787a.b(clipRect, header);
        if (this.f59788b.a(recyclerView) == 1) {
            clipRect.set(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), (recyclerView.getWidth() - recyclerView.getPaddingRight()) - clipRect.right, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            clipRect.set(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getWidth() - recyclerView.getPaddingRight(), (recyclerView.getHeight() - recyclerView.getPaddingBottom()) - clipRect.bottom);
        }
    }

    public a(b orientationProvider, gu.a dimensionCalculator) {
        this.f59789c = new Rect();
        this.f59788b = orientationProvider;
        this.f59787a = dimensionCalculator;
    }
}
