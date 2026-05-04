package org.mozilla.javascript.tools.debugger;

import java.awt.ActiveEvent;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.MenuComponent;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileFilter;
import javax.swing.text.BadLocationException;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.SecurityUtilities;
import org.mozilla.javascript.tools.debugger.Dim;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class SwingGui extends JFrame implements GuiCallback {
    private static final long serialVersionUID = -8217029773456711621L;
    private EventQueue awtEventQueue;
    private JSInternalConsole console;
    private ContextWindow context;
    private FileWindow currentWindow;
    private JDesktopPane desk;
    Dim dim;
    JFileChooser dlg;
    private Runnable exitAction;
    private final Map<String, FileWindow> fileWindows;
    private Menubar menubar;
    private JSplitPane split1;
    private JLabel statusBar;
    private JToolBar toolBar;
    private final Map<String, JFrame> toplevels;

    public SwingGui(Dim dim, String str) {
        super(str);
        this.toplevels = Collections.synchronizedMap(new HashMap());
        this.fileWindows = Collections.synchronizedMap(new HashMap());
        this.dim = dim;
        init();
        dim.setGuiCallback(this);
    }

    private String chooseFile(String str) {
        this.dlg.setDialogTitle(str);
        String systemProperty = SecurityUtilities.getSystemProperty("user.dir");
        File file = systemProperty != null ? new File(systemProperty) : null;
        if (file != null) {
            this.dlg.setCurrentDirectory(file);
        }
        if (this.dlg.showOpenDialog(this) == 0) {
            try {
                String canonicalPath = this.dlg.getSelectedFile().getCanonicalPath();
                File parentFile = this.dlg.getSelectedFile().getParentFile();
                Properties properties = System.getProperties();
                properties.put("user.dir", parentFile.getPath());
                System.setProperties(properties);
                return canonicalPath;
            } catch (IOException | SecurityException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void exit() {
        Runnable runnable = this.exitAction;
        if (runnable != null) {
            SwingUtilities.invokeLater(runnable);
        }
        this.dim.setReturnValue(5);
    }

    private JInternalFrame getSelectedFrame() {
        JInternalFrame[] allFrames = this.desk.getAllFrames();
        for (int i11 = 0; i11 < allFrames.length; i11++) {
            if (allFrames[i11].isShowing()) {
                return allFrames[i11];
            }
        }
        return allFrames[allFrames.length - 1];
    }

    public static String getShortName(String str) {
        int i11;
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf < 0) {
            lastIndexOf = str.lastIndexOf(92);
        }
        return (lastIndexOf < 0 || (i11 = lastIndexOf + 1) >= str.length()) ? str : str.substring(i11);
    }

    private JMenu getWindowMenu() {
        return this.menubar.getMenu(3);
    }

    private void init() {
        Menubar menubar = new Menubar(this);
        this.menubar = menubar;
        setJMenuBar(menubar);
        this.toolBar = new JToolBar();
        String[] strArr = {"Break (Pause)", "Go (F5)", "Step Into (F11)", "Step Over (F7)", "Step Out (F8)"};
        JButton jButton = new JButton("Break");
        jButton.setToolTipText("Break");
        jButton.setActionCommand("Break");
        jButton.addActionListener(this.menubar);
        jButton.setEnabled(true);
        jButton.setToolTipText(strArr[0]);
        JButton jButton2 = new JButton("Go");
        jButton2.setToolTipText("Go");
        jButton2.setActionCommand("Go");
        jButton2.addActionListener(this.menubar);
        jButton2.setEnabled(false);
        jButton2.setToolTipText(strArr[1]);
        JButton jButton3 = new JButton("Step Into");
        jButton3.setToolTipText("Step Into");
        jButton3.setActionCommand("Step Into");
        jButton3.addActionListener(this.menubar);
        jButton3.setEnabled(false);
        jButton3.setToolTipText(strArr[2]);
        JButton jButton4 = new JButton("Step Over");
        jButton4.setToolTipText("Step Over");
        jButton4.setActionCommand("Step Over");
        jButton4.setEnabled(false);
        jButton4.addActionListener(this.menubar);
        jButton4.setToolTipText(strArr[3]);
        JButton jButton5 = new JButton("Step Out");
        jButton5.setToolTipText("Step Out");
        jButton5.setActionCommand("Step Out");
        jButton5.setEnabled(false);
        jButton5.addActionListener(this.menubar);
        jButton5.setToolTipText(strArr[4]);
        Dimension preferredSize = jButton4.getPreferredSize();
        jButton.setPreferredSize(preferredSize);
        jButton.setMinimumSize(preferredSize);
        jButton.setMaximumSize(preferredSize);
        jButton.setSize(preferredSize);
        jButton2.setPreferredSize(preferredSize);
        jButton2.setMinimumSize(preferredSize);
        jButton2.setMaximumSize(preferredSize);
        jButton3.setPreferredSize(preferredSize);
        jButton3.setMinimumSize(preferredSize);
        jButton3.setMaximumSize(preferredSize);
        jButton4.setPreferredSize(preferredSize);
        jButton4.setMinimumSize(preferredSize);
        jButton4.setMaximumSize(preferredSize);
        jButton5.setPreferredSize(preferredSize);
        jButton5.setMinimumSize(preferredSize);
        jButton5.setMaximumSize(preferredSize);
        this.toolBar.add(jButton);
        this.toolBar.add(jButton2);
        this.toolBar.add(jButton3);
        this.toolBar.add(jButton4);
        this.toolBar.add(jButton5);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        getContentPane().add(this.toolBar, "North");
        getContentPane().add(jPanel, "Center");
        JDesktopPane jDesktopPane = new JDesktopPane();
        this.desk = jDesktopPane;
        jDesktopPane.setPreferredSize(new Dimension(600, 300));
        this.desk.setMinimumSize(new Dimension(150, 50));
        JDesktopPane jDesktopPane2 = this.desk;
        JSInternalConsole jSInternalConsole = new JSInternalConsole("JavaScript Console");
        this.console = jSInternalConsole;
        jDesktopPane2.add(jSInternalConsole);
        ContextWindow contextWindow = new ContextWindow(this);
        this.context = contextWindow;
        contextWindow.setPreferredSize(new Dimension(600, 120));
        this.context.setMinimumSize(new Dimension(50, 50));
        JSplitPane jSplitPane = new JSplitPane(0, this.desk, this.context);
        this.split1 = jSplitPane;
        jSplitPane.setOneTouchExpandable(true);
        setResizeWeight(this.split1, 0.66d);
        jPanel.add(this.split1, "Center");
        JLabel jLabel = new JLabel();
        this.statusBar = jLabel;
        jLabel.setText("Thread: ");
        jPanel.add(this.statusBar, "South");
        this.dlg = new JFileChooser();
        this.dlg.addChoosableFileFilter(new FileFilter() { // from class: org.mozilla.javascript.tools.debugger.SwingGui.1
            public boolean accept(File file) {
                if (file.isDirectory()) {
                    return true;
                }
                String name = file.getName();
                int lastIndexOf = name.lastIndexOf(46);
                return lastIndexOf > 0 && lastIndexOf < name.length() - 1 && name.substring(lastIndexOf + 1).toLowerCase().equals("js");
            }

            public String getDescription() {
                return "JavaScript Files (*.js)";
            }
        });
        addWindowListener(new WindowAdapter() { // from class: org.mozilla.javascript.tools.debugger.SwingGui.2
            public void windowClosing(WindowEvent windowEvent) {
                SwingGui.this.exit();
            }
        });
    }

    private String readFile(String str) {
        try {
            FileReader fileReader = new FileReader(str);
            try {
                return Kit.readReader(fileReader);
            } finally {
                fileReader.close();
            }
        } catch (IOException e11) {
            MessageDialogWrapper.showMessageDialog(this, e11.getMessage(), "Error reading " + str, 0);
            return null;
        }
    }

    private void setFilePosition(FileWindow fileWindow, int i11) {
        FileTextArea fileTextArea = fileWindow.textArea;
        try {
            if (i11 == -1) {
                fileWindow.setPosition(-1);
                if (this.currentWindow == fileWindow) {
                    this.currentWindow = null;
                }
            } else {
                int lineStartOffset = fileTextArea.getLineStartOffset(i11 - 1);
                FileWindow fileWindow2 = this.currentWindow;
                if (fileWindow2 != null && fileWindow2 != fileWindow) {
                    fileWindow2.setPosition(-1);
                }
                fileWindow.setPosition(lineStartOffset);
                this.currentWindow = fileWindow;
            }
        } catch (BadLocationException unused) {
        }
        if (fileWindow.isIcon()) {
            this.desk.getDesktopManager().deiconifyFrame(fileWindow);
        }
        this.desk.getDesktopManager().activateFrame(fileWindow);
        try {
            fileWindow.show();
            fileWindow.toFront();
            fileWindow.setSelected(true);
        } catch (Exception unused2) {
        }
    }

    public static void setResizeWeight(JSplitPane jSplitPane, double d11) {
        try {
            JSplitPane.class.getMethod("setResizeWeight", Double.TYPE).invoke(jSplitPane, new Double(d11));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }

    private void updateEnabled(boolean z11) {
        ((Menubar) getJMenuBar()).updateEnabled(z11);
        int componentCount = this.toolBar.getComponentCount();
        int i11 = 0;
        while (i11 < componentCount) {
            this.toolBar.getComponent(i11).setEnabled(i11 == 0 ? !z11 : z11);
            i11++;
        }
        if (!z11) {
            FileWindow fileWindow = this.currentWindow;
            if (fileWindow != null) {
                fileWindow.setPosition(-1);
            }
            this.context.setEnabled(false);
            return;
        }
        this.toolBar.setEnabled(true);
        if (getExtendedState() == 1) {
            setExtendedState(0);
        }
        toFront();
        this.context.setEnabled(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void actionPerformed(java.awt.event.ActionEvent r14) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.tools.debugger.SwingGui.actionPerformed(java.awt.event.ActionEvent):void");
    }

    public void addTopLevel(String str, JFrame jFrame) {
        if (jFrame != this) {
            this.toplevels.put(str, jFrame);
        }
    }

    public void createFileWindow(Dim.SourceInfo sourceInfo, int i11) {
        String url = sourceInfo.url();
        FileWindow fileWindow = new FileWindow(this, sourceInfo);
        this.fileWindows.put(url, fileWindow);
        if (i11 != -1) {
            FileWindow fileWindow2 = this.currentWindow;
            if (fileWindow2 != null) {
                fileWindow2.setPosition(-1);
            }
            try {
                try {
                    fileWindow.setPosition(fileWindow.textArea.getLineStartOffset(i11 - 1));
                } catch (BadLocationException unused) {
                    fileWindow.setPosition(-1);
                }
            } catch (BadLocationException unused2) {
                fileWindow.setPosition(fileWindow.textArea.getLineStartOffset(0));
            }
        }
        this.desk.add(fileWindow);
        if (i11 != -1) {
            this.currentWindow = fileWindow;
        }
        this.menubar.addFile(url);
        fileWindow.setVisible(true);
        try {
            fileWindow.setMaximum(true);
            fileWindow.setSelected(true);
            fileWindow.moveToFront();
        } catch (Exception unused3) {
        }
    }

    @Override // org.mozilla.javascript.tools.debugger.GuiCallback
    public void dispatchNextGuiEvent() throws InterruptedException {
        EventQueue eventQueue = this.awtEventQueue;
        if (eventQueue == null) {
            eventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
            this.awtEventQueue = eventQueue;
        }
        ActiveEvent nextEvent = eventQueue.getNextEvent();
        if (nextEvent instanceof ActiveEvent) {
            nextEvent.dispatch();
            return;
        }
        Object source = nextEvent.getSource();
        if (source instanceof Component) {
            ((Component) source).dispatchEvent(nextEvent);
        } else if (source instanceof MenuComponent) {
            ((MenuComponent) source).dispatchEvent(nextEvent);
        }
    }

    @Override // org.mozilla.javascript.tools.debugger.GuiCallback
    public void enterInterrupt(Dim.StackFrame stackFrame, String str, String str2) {
        if (SwingUtilities.isEventDispatchThread()) {
            enterInterruptImpl(stackFrame, str, str2);
            return;
        }
        RunProxy runProxy = new RunProxy(this, 4);
        runProxy.lastFrame = stackFrame;
        runProxy.threadTitle = str;
        runProxy.alertMessage = str2;
        SwingUtilities.invokeLater(runProxy);
    }

    public void enterInterruptImpl(Dim.StackFrame stackFrame, String str, String str2) {
        this.statusBar.setText("Thread: " + str);
        showStopLine(stackFrame);
        if (str2 != null) {
            MessageDialogWrapper.showMessageDialog(this, str2, "Exception in Script", 0);
        }
        updateEnabled(true);
        Dim.ContextData contextData = stackFrame.contextData();
        ContextWindow contextWindow = this.context;
        JComboBox jComboBox = contextWindow.context;
        List<String> list = contextWindow.toolTips;
        contextWindow.disableUpdate();
        int frameCount = contextData.frameCount();
        jComboBox.removeAllItems();
        jComboBox.setSelectedItem((Object) null);
        list.clear();
        for (int i11 = 0; i11 < frameCount; i11++) {
            Dim.StackFrame frame = contextData.getFrame(i11);
            String url = frame.getUrl();
            int lineNumber = frame.getLineNumber();
            jComboBox.insertItemAt("\"" + (url.length() > 20 ? "..." + url.substring(url.length() - 17) : url) + "\", line " + lineNumber, i11);
            list.add("\"" + url + "\", line " + lineNumber);
        }
        this.context.enableUpdate();
        jComboBox.setSelectedIndex(0);
        jComboBox.setMinimumSize(new Dimension(50, jComboBox.getMinimumSize().height));
    }

    public JSInternalConsole getConsole() {
        return this.console;
    }

    public FileWindow getFileWindow(String str) {
        if (str == null || str.equals("<stdin>")) {
            return null;
        }
        return this.fileWindows.get(str);
    }

    public Menubar getMenubar() {
        return this.menubar;
    }

    @Override // org.mozilla.javascript.tools.debugger.GuiCallback
    public boolean isGuiEventThread() {
        return SwingUtilities.isEventDispatchThread();
    }

    public void removeWindow(FileWindow fileWindow) {
        this.fileWindows.remove(fileWindow.getUrl());
        JMenu windowMenu = getWindowMenu();
        int itemCount = windowMenu.getItemCount();
        int i11 = itemCount - 1;
        JMenuItem item = windowMenu.getItem(i11);
        String shortName = getShortName(fileWindow.getUrl());
        int i12 = 5;
        while (true) {
            if (i12 >= itemCount) {
                break;
            }
            JMenuItem item2 = windowMenu.getItem(i12);
            if (item2 != null) {
                String text = item2.getText();
                if (text.substring(text.indexOf(32) + 1).equals(shortName)) {
                    windowMenu.remove(item2);
                    if (itemCount == 6) {
                        windowMenu.remove(4);
                    } else {
                        int i13 = i12 - 4;
                        while (i12 < i11) {
                            JMenuItem item3 = windowMenu.getItem(i12);
                            if (item3 != null) {
                                String text2 = item3.getText();
                                if (text2.equals("More Windows...")) {
                                    break;
                                }
                                int indexOf = text2.indexOf(32);
                                StringBuilder sb2 = new StringBuilder();
                                int i14 = i13 + 48;
                                sb2.append((char) i14);
                                sb2.append(" ");
                                sb2.append(text2.substring(indexOf + 1));
                                item3.setText(sb2.toString());
                                item3.setMnemonic(i14);
                                i13++;
                            }
                            i12++;
                        }
                        if (itemCount - 6 == 0 && item != item2 && item.getText().equals("More Windows...")) {
                            windowMenu.remove(item);
                        }
                    }
                }
            }
            i12++;
        }
        windowMenu.revalidate();
    }

    public void setExitAction(Runnable runnable) {
        this.exitAction = runnable;
    }

    public void setVisible(boolean z11) {
        super.setVisible(z11);
        if (z11) {
            this.console.consoleTextArea.requestFocus();
            this.context.split.setDividerLocation(0.5d);
            try {
                this.console.setMaximum(true);
                this.console.setSelected(true);
                this.console.show();
                this.console.consoleTextArea.requestFocus();
            } catch (Exception unused) {
            }
        }
    }

    public void showFileWindow(String str, int i11) {
        FileWindow fileWindow = getFileWindow(str);
        if (fileWindow == null) {
            createFileWindow(this.dim.sourceInfo(str), -1);
            fileWindow = getFileWindow(str);
        }
        if (i11 > -1) {
            int position = fileWindow.getPosition(i11 - 1);
            int position2 = fileWindow.getPosition(i11) - 1;
            fileWindow.textArea.select(position);
            fileWindow.textArea.setCaretPosition(position);
            fileWindow.textArea.moveCaretPosition(position2);
        }
        try {
            if (fileWindow.isIcon()) {
                fileWindow.setIcon(false);
            }
            fileWindow.setVisible(true);
            fileWindow.moveToFront();
            fileWindow.setSelected(true);
            requestFocus();
            fileWindow.requestFocus();
            fileWindow.textArea.requestFocus();
        } catch (Exception unused) {
        }
    }

    public void showStopLine(Dim.StackFrame stackFrame) {
        String url = stackFrame.getUrl();
        if (url == null || url.equals("<stdin>")) {
            if (this.console.isVisible()) {
                this.console.show();
            }
        } else {
            showFileWindow(url, -1);
            int lineNumber = stackFrame.getLineNumber();
            FileWindow fileWindow = getFileWindow(url);
            if (fileWindow != null) {
                setFilePosition(fileWindow, lineNumber);
            }
        }
    }

    public boolean updateFileWindow(Dim.SourceInfo sourceInfo) {
        FileWindow fileWindow = getFileWindow(sourceInfo.url());
        if (fileWindow == null) {
            return false;
        }
        fileWindow.updateText(sourceInfo);
        fileWindow.show();
        return true;
    }

    @Override // org.mozilla.javascript.tools.debugger.GuiCallback
    public void updateSourceText(Dim.SourceInfo sourceInfo) {
        RunProxy runProxy = new RunProxy(this, 3);
        runProxy.sourceInfo = sourceInfo;
        SwingUtilities.invokeLater(runProxy);
    }
}
