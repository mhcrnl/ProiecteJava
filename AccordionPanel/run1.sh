#! /bin/bash
echo -----------------------------------------------------
echo $ export JAVA_HOME="$(jrunscript -e 'java.lang.System.out.println(java.lang.System.getProperty("java.home"));')"
echo -----------------------------------------------------
wmctrl -r:ACTIVE:-N "Hello Terminal"
cd /home/mhcrnl/Desktop/ProiecteJava/AccordionPanel/src/java/example
javac /home/mhcrnl/Desktop/ProiecteJava/AccordionPanel/src/java/example/MainPanel.java
java /home/mhcrnl/Desktop/ProiecteJava/AccordionPanel/src/java/example/MainPanel
