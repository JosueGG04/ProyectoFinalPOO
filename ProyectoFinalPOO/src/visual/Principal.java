package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 394);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnGPersonas = new JMenu("Gesti\u00F3n de Personas");
		menuBar.add(mnGPersonas);
		
		JMenuItem mntmAddPersona = new JMenuItem("Agregar Persona");
		mnGPersonas.add(mntmAddPersona);
		
		JMenuItem mntmListarPersona = new JMenuItem("Listar Personas");
		mnGPersonas.add(mntmListarPersona);
		
		JMenu mnGEmpresas = new JMenu("Gesti\u00F3n de Empresas");
		menuBar.add(mnGEmpresas);
		
		JMenuItem mntmAddEmpresa = new JMenuItem("Agregar Empresa");
		mnGEmpresas.add(mntmAddEmpresa);
		
		JMenuItem mntmListarEmpresa = new JMenuItem("Listar Empresas");
		mnGEmpresas.add(mntmListarEmpresa);
		
		JMenu mnGSolicitudPersona = new JMenu("Gesti\u00F3n de Solicitudes de Personas");
		menuBar.add(mnGSolicitudPersona);
		
		JMenuItem mntmAddGestionPersona = new JMenuItem("Agregar Solicitud de Persona");
		mnGSolicitudPersona.add(mntmAddGestionPersona);
		
		JMenuItem mntmListarSolicitudPersona = new JMenuItem("Listar Solicitudes de Persona");
		mnGSolicitudPersona.add(mntmListarSolicitudPersona);
		
		JMenu mnGSolicitudEmpresa = new JMenu("Gesti\u00F3n de Solicitudes de Empresa");
		menuBar.add(mnGSolicitudEmpresa);
		
		JMenuItem mntmAddSolicitudEmpresa = new JMenuItem("Agregar Solicitud de Empresa");
		mnGSolicitudEmpresa.add(mntmAddSolicitudEmpresa);
		
		JMenuItem mntmLIstarSolicitudEmpresa = new JMenuItem("Listar Solicitudes de Empresa");
		mnGSolicitudEmpresa.add(mntmLIstarSolicitudEmpresa);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
	}
}
