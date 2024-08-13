import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class User_YouTube_UI
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("User YouTube UI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        frame.setLayout(new BorderLayout());

        JPanel searchPanel = new JPanel();
        searchPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JTextField searchField = new JTextField(40);
        JButton searchButton = new JButton("Search Bro");

        searchPanel.add(searchField);
        searchPanel.add(searchButton);

        JPanel videoPanel = new JPanel();
        videoPanel.setLayout(new BorderLayout());

        JLabel videoLabel = new JLabel("Video Player Space", SwingConstants.CENTER);
        videoLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        videoLabel.setPreferredSize(new Dimension(750, 400));
        videoPanel.add(videoLabel, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton likeButton = new JButton("Like !!!");
        JButton subscribeButton = new JButton("Subscribe !!!");
        JButton downloadButton = new JButton("Download !!!");
        JButton shareButton = new JButton("Share !!!");
        JButton commentsButton = new JButton("Comments !!!");

        controlPanel.add(likeButton);
        controlPanel.add(subscribeButton);
        controlPanel.add(downloadButton);
        controlPanel.add(shareButton);
        controlPanel.add(commentsButton);

        JPanel thumbnailPanel = new JPanel();
        thumbnailPanel.setLayout(new GridLayout(0, 3, 10, 10));

        for (int i = 1; i <= 6; i++)
        {
            JPanel thumbnail = new JPanel();
            thumbnail.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            thumbnail.setPreferredSize(new Dimension(200, 150));
            thumbnail.setLayout(new BorderLayout());

            JLabel thumbnailLabel = new JLabel("Video " + i, SwingConstants.CENTER);
            thumbnailLabel.setPreferredSize(new Dimension(200, 120));
            thumbnail.add(thumbnailLabel, BorderLayout.CENTER);

            JButton playButton = new JButton("Play");
            playButton.setPreferredSize(new Dimension(200, 30));
            thumbnail.add(playButton, BorderLayout.SOUTH);
            playButton.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    System.out.println("Clicked -> Video Button !!!");
                }
            });

            thumbnailPanel.add(thumbnail);
        }

        frame.add(searchPanel, BorderLayout.NORTH);
        frame.add(videoPanel, BorderLayout.CENTER);
        frame.add(controlPanel, BorderLayout.SOUTH);
        frame.add(new JScrollPane(thumbnailPanel), BorderLayout.EAST);

        frame.setVisible(true);

        searchButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Search Button Clicked Now !!! : " + searchField.getText());
            }
        });
        likeButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Clicked - Like Button !!!");
            }
        });
        subscribeButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Clicked - Subscribe Button !!!");
            }
        });
        downloadButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Clicked - Download Button !!!");
            }
        });
        shareButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Clicked - Share Button !!!");
            }
        });
        commentsButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Clicked - Comments Button !!!");
            }
        });
    }
}

