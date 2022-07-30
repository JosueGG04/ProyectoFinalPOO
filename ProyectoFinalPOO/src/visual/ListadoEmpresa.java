package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import logico.Administracion;
import logico.Empresa;
import logico.Factura;
import logico.Queseria;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ListadoEmpresa extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable tblListadoEmpresa;
	private static DefaultTableModel model;
	private static Object[] row;
	private Empresa selected = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListadoEmpresa dialog = new ListadoEmpresa();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ListadoEmpresa() {
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JScrollPane scrollPane = new JScrollPane();
			contentPanel.add(scrollPane, BorderLayout.CENTER);
			{
				tblListadoEmpresa = new JTable();
				tblListadoEmpresa.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						int index = tblListadoEmpresa.getSelectedRow();
						if(index>=0) {
							String RNC = tblListadoEmpresa.getValueAt(index, 0).toString();
							selected = Administracion.getInstance().buscarEmpresaPorRNC(RNC);
						}
					}
				});
				tblListadoEmpresa.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				model = new DefaultTableModel();
				String[] headers = {"RNC", "Nombre", "Director", "Teléfono de Empresa", "Correo de Empresa", "Teléfono de Director", "Correo de Director"};
				model.setColumnIdentifiers(headers);
				tblListadoEmpresa.setModel(model);
				scrollPane.setViewportView(tblListadoEmpresa);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.setActionCommand("Cancel");
				buttonPane.add(btnCancelar);
			}
		}
		loadEmpresa();
	}
	public static void loadEmpresa() {
		model.setRowCount(0);
		row = new Object[model.getColumnCount()];
		for(int i = 0; i < Administracion.getInstance().getMisEmpresas().size(); i++) {
			row[0]=Administracion.getInstance().getMisEmpresas().get(i).getRNC();
			row[1]=Administracion.getInstance().getMisEmpresas().get(i).getNombre();
			row[2]=Administracion.getInstance().getMisEmpresas().get(i).getDirector();
			row[3]=Administracion.getInstance().getMisEmpresas().get(i).getTelefono();
			row[4]=Administracion.getInstance().getMisEmpresas().get(i).getTelDirector();
			row[5]=Administracion.getInstance().getMisEmpresas().get(i).getCorreo();
			row[6]=Administracion.getInstance().getMisEmpresas().get(i).getCorreoDirector();
			model.addRow(row);
		}
	}
}
