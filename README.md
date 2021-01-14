# Polyglot Java Development Starter (Containers)

As a Polyglot Software Engineer, a significant part of your work will require you to ensure that your code always works consistently no matter where it is run. Java in itself provides some of this but not all. Please follow through these instructions to get set up in Visual Studio code with a sandbox environment.

For a background on containers in VSCode - please read **[VS Code Remote - Containers](https://aka.ms/vscode-remote/containers)** extension in a few easy steps. 

## Setting up the development container

Follow these steps to open this sample in a container:

1. Since this is likely your first time using a development container, please follow the [getting started steps](https://aka.ms/vscode-remote/containers/getting-started).

2. To use this repository, open the repository in an isolated Docker volume (we'll cover these steps in the workshop):

   - Fork this repository on your own GitHub 
   - Clone your fork of this repository to your local filesystem.
   - Follow the prompts to setup your Docker instance 
   - Post any questions to the channel.

## Things to try

Once you have this sample opened in a container, you'll be able to work with it like you would locally.

1. **Edit:**
   - Open `src/main/java/com/mycompany/app/App.java`.
   - Try adding some code and check out the language features.
2. **Terminal:** Press <kbd>Ctrl</kbd>+<kbd>Shift</kbd>+<kbd>\`</kbd> and type `uname` and other Linux commands from the terminal window.
3. **Build, Run, and Debug:**
   - Open `src/main/java/com/mycompany/app/App.java`.
   - Add a breakpoint.
   - Press <kbd>F5</kbd> to launch the app in the container.
   - Once the breakpoint is hit, try hovering over variables, examining locals, and more.
4. **Run a Test:**
   - Open `src/test/java/com/mycompany/app/AppTest.java`.
   - Put a breakpoint in a test.
   - Click the `Debug Test` in the Code Lens above the function and watch it hit the breakpoint.
  
> **Note:** We'll be adding features to this as we go and you'll be given access to new branches in this repository to base your ideas on.
