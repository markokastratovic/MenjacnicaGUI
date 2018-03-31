package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Dimension;


import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;
import java.awt.Toolkit;


public class MenjacnicaGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JButton btnDodajKurs;
	private JButton btnObrisiKurs;
	private JButton btnIzvrsiZamenu;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnHelp;
	private JMenu mnOpen;
	private JMenu mnSave;
	private JMenu mnExit;
	private JMenu mnAbout;
	private JScrollPane scrollPane;
	private JTable table;
	private JScrollPane scrollPane_1;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenjacnicaGUI frame = new MenjacnicaGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenjacnicaGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenjacnicaGUI.class.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Indent-Black-rtl.png")));
		setTitle("Menjacnica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 397);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.EAST);
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
		contentPane.add(getScrollPane_1(), BorderLayout.SOUTH);
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(130, 500));
			panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panel.add(getBtnDodajKurs());
			panel.add(getBtnObrisiKurs());
			panel.add(getBtnIzvrsiZamenu());
			btnDodajKurs.setPreferredSize(new Dimension(120, 30));
			btnObrisiKurs.setPreferredSize(new Dimension(120, 30));
			btnIzvrsiZamenu.setPreferredSize(new Dimension(120, 30));
		}
		return panel;
	}
	private JButton getBtnDodajKurs() {
		if (btnDodajKurs == null) {
			btnDodajKurs = new JButton("Dodaj kurs");
		}
		return btnDodajKurs;
	}
	private JButton getBtnObrisiKurs() {
		if (btnObrisiKurs == null) {
			btnObrisiKurs = new JButton("Obrisi kurs");
		}
		return btnObrisiKurs;
	}
	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
		}
		return btnIzvrsiZamenu;
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnHelp());
		}
		return menuBar;
	}
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMnOpen());
			mnFile.add(getMnSave());
			mnFile.add(getMnExit());
		}
		return mnFile;
	}
	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu("Help");
			mnHelp.add(getMnAbout());
		}
		return mnHelp;
	}
	private JMenu getMnOpen() {
		if (mnOpen == null) {
			mnOpen = new JMenu("Open");
			mnOpen.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/NewFolder.gif")));
		}
		return mnOpen;
	}
	private JMenu getMnSave() {
		if (mnSave == null) {
			mnSave = new JMenu("Save");
			mnSave.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		}
		return mnSave;
	}
	private JMenu getMnExit() {
		if (mnExit == null) {
			mnExit = new JMenu("Exit");
		}
		return mnExit;
	}
	private JMenu getMnAbout() {
		if (mnAbout == null) {
			mnAbout = new JMenu("About");
			mnAbout.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/javax/swing/plaf/metal/icons/Inform.gif")));
		}
		return mnAbout;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTable_1());
		}
		return scrollPane;
	}
	private JTable getTable_1() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
				},
				new String[] {
					"Sifra", "Skraceni naziv", "Prodajni", "Srednji", "Kupovni", "Naziv"
				}
			));
		}
		return table;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setViewportBorder(new TitledBorder(null, "STATUS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			scrollPane_1.setToolTipText("STATUS\r\n");
			scrollPane_1.setPreferredSize(new Dimension(scrollPane_1.getWidth(),60+scrollPane_1.getHeight()));
			scrollPane_1.setViewportView(getTextArea());
		}
		return scrollPane_1;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setRows(1);
		}
		return textArea;
	}
}
