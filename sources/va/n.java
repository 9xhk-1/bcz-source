package va;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class n extends LinkMovementMethod {

    /* renamed from: c, reason: collision with root package name */
    public static n f93786c;

    /* renamed from: a, reason: collision with root package name */
    public p f93787a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f93788b;

    public static n a() {
        if (f93786c == null) {
            f93786c = new n();
        }
        return f93786c;
    }

    public final p b(TextView textView, Spannable spannable, MotionEvent event) {
        int x11 = (int) event.getX();
        int y11 = (int) event.getY();
        int totalPaddingLeft = x11 - textView.getTotalPaddingLeft();
        int totalPaddingTop = y11 - textView.getTotalPaddingTop();
        int scrollX = totalPaddingLeft + textView.getScrollX();
        int scrollY = totalPaddingTop + textView.getScrollY();
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
        p[] pVarArr = (p[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, p.class);
        if (pVarArr.length > 0) {
            return pVarArr[0];
        }
        return null;
    }

    public void c(boolean holdPress) {
        this.f93788b = holdPress;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent event) {
        int action = event.getAction() & 255;
        if (action == 0) {
            p b11 = b(textView, spannable, event);
            this.f93787a = b11;
            if (b11 != null) {
                b11.setPressed(true);
                Selection.setSelection(spannable, spannable.getSpanStart(this.f93787a), spannable.getSpanEnd(this.f93787a));
            }
        } else if (action == 2) {
            p b12 = b(textView, spannable, event);
            p pVar = this.f93787a;
            if (pVar != null && b12 != pVar) {
                pVar.setPressed(false);
                this.f93787a = null;
                Selection.removeSelection(spannable);
            }
        } else {
            p pVar2 = this.f93787a;
            if (pVar2 != null) {
                if (!this.f93788b || action == 3 || action == 5) {
                    pVar2.setPressed(false);
                }
                super.onTouchEvent(textView, spannable, event);
            }
            this.f93787a = null;
            Selection.removeSelection(spannable);
        }
        return true;
    }
}
