/*making the delete function*/



private void deleteNote() {
    String desktopPath = System.getProperty("user.home") + File.separator + "Desktop" + File.separator + "assignment";

    JFileChooser fileChooser = new JFileChooser(desktopPath);
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files (*.txt)", "txt");
    fileChooser.setFileFilter(filter);
    int returnVal = fileChooser.showOpenDialog(this);

    if (returnVal == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete " + selectedFile.getName() + "?");

        if (confirm == JOptionPane.YES_OPTION) {
            if (selectedFile.delete()) {
                JOptionPane.showMessageDialog(this, "Note deleted successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Error deleting note!");
            }
        }
    }
}
