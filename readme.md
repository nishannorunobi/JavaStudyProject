
# add ssh key, git clone then, Install sdkman, to switch between jdk, for each projects

# Step 1 — Install SDKMAN
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"


# To see available list
sdk list java


# Step 2 — Install all JDKs you need
sdk install java 25-tem
sdk install java 21-tem
sdk install java 17-tem

# Step 1 — uninstall current
sdk uninstall java 25-tem

# Step 3 — Enable auto-switch
nano ~/.sdkman/etc/config
# set → sdkman_auto_env=true

# Or switch to different sdk by the following command.
# Switch to JDK 25
sdk use java 25-tem

# Switch to JDK 21
sdk use java 21-tem

# Switch to JDK 17
sdk use java 17-tem

# Permanent — all terminals, all sessions
sdk default java 25-tem

# Verify current version
java -version

# See current active JDK
sdk current java

# to load in current session
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk use java 25-tem
java -version

# Step 4 — Add .sdkmanrc to each project
echo "java=25-tem" > ~/workspaces/java25-jep-demos/.sdkmanrc
echo "java=21-tem" > ~/workspaces/old-project/.sdkmanrc
echo "java=17-tem" > ~/workspaces/another-project/.sdkmanrc
```

---

### IDE — point each project to correct JDK:

**IntelliJ — per project SDK:**
```
File → Project Structure → Project SDK
    → ~/.sdkman/candidates/java/25-tem   ← java25-jep-demos
    → ~/.sdkman/candidates/java/21-tem   ← old-project