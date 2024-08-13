import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class YouTube_Video_UI
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("User YouTube UI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        frame.setLayout(new BorderLayout());

        JPanel searchPanel = new JPanel();
        searchPanel.setLayout(new FlowLayout());

        JTextField searchField = new JTextField(30);
        JButton searchButton = new JButton("Search");

        searchPanel.add(searchField);
        searchPanel.add(searchButton);

        JPanel videoPanel = new JPanel();
        videoPanel.setLayout(new GridLayout(0, 3, 10, 10));

        for (int i = 1; i <= 9; i++)
        {
            JPanel videoThumbnail = new JPanel();
            videoThumbnail.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            videoThumbnail.setPreferredSize(new Dimension(200, 150));
            videoThumbnail.setLayout(new BorderLayout());

            JLabel thumbnailLabel = new JLabel("Video " + i, SwingConstants.CENTER);
            thumbnailLabel.setPreferredSize(new Dimension(200, 150));
            videoThumbnail.add(thumbnailLabel, BorderLayout.CENTER);

            JButton playButton = new JButton("Play");
            playButton.setPreferredSize(new Dimension(200, 30));
            videoThumbnail.add(playButton, BorderLayout.SOUTH);

            videoPanel.add(videoThumbnail);
        }

        frame.add(searchPanel, BorderLayout.NORTH);
        frame.add(new JScrollPane(videoPanel), BorderLayout.CENTER);

        frame.setVisible(true);

        searchButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Search clicked: " + searchField.getText());
            }
        });
    }
}

