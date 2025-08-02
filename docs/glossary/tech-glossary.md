---
icon: laptop-mobile
---

# Tech Glossary

## Programming Languages

<table><thead><tr><th width="156.69921875">Technology</th><th>Description</th></tr></thead><tbody><tr><td><strong>------------------</strong></td><td><p><strong>Machine Language</strong></p><ul><li><p>communicates directly with computing machines in binary code (0's &#x26; 1's) </p><ul><li>1 ⇒ a pulse of electricity</li><li>0 ⇒ no electrical pulse</li></ul></li></ul></td></tr><tr><td><strong>------------------</strong></td><td><strong>Platform Specific (OS Specific) Scripting Languages</strong></td></tr><tr><td>PowerShell</td><td>used on Windows OS; widely used by system administrators</td></tr><tr><td>Bash</td><td>used on Linux OS; widely used by system administrators</td></tr><tr><td><strong>------------------</strong></td><td><strong>General Purpose Scripting Languages</strong></td></tr><tr><td>Python</td><td>widely used for scripting &#x26; automation</td></tr><tr><td>Perl</td><td>widely used for scripting &#x26; automation</td></tr><tr><td>Ruby</td><td>widely used for scripting &#x26; automation</td></tr><tr><td><strong>-------------------</strong></td><td><strong>Client Side Scripting Languages</strong><br>— the scripts are transferred from a web server to the end-user's internet browser, and then executed in the browser — </td></tr><tr><td>JavaScript</td><td>originally developed as a client side scripting language for the web is increasingly used at server side for broader set of tasks</td></tr><tr><td><strong>-------------------</strong></td><td><strong>Object-oriented Programming Languages</strong></td></tr><tr><td>Java</td><td>purely object-oriented programming language</td></tr><tr><td></td><td></td></tr><tr><td><strong>-------------------</strong></td><td><strong>Other Programming Languages</strong> </td></tr><tr><td>C </td><td></td></tr><tr><td>C++</td><td></td></tr><tr><td>Go</td><td></td></tr><tr><td><strong>-------------------</strong></td><td><p><strong>Cross-platform Languages</strong></p><p>— programming languages that are compatible with more than 1 platforms / OSs — </p></td></tr><tr><td></td><td></td></tr></tbody></table>



## Code Editors vs IDEs

metaphor

* code editor — landline phone
* IDE — smart phone

<table><thead><tr><th width="215.8671875"></th><th></th></tr></thead><tbody><tr><td><strong>-------------------</strong></td><td><p><strong>Code Editors</strong></p><ul><li>Like a text editor that helps to define the code structure &#x26; function; provide features, including syntax highlighting, automatic indentation,  error checking, and auto-completion</li></ul></td></tr><tr><td><strong><code>VS Code</code></strong></td><td><ul><li>need to have <code>Python3</code> , <code>VS Code</code> &#x26; <code>VS Code Python extension</code> installed to code in Python in VSCode</li></ul><ul><li>many extensions are available to support coding, code maintenance, testing, packaging, &#x26; etc</li></ul></td></tr><tr><td><strong><code>JupyterLab</code></strong></td><td><p></p><ul><li>web-based interface that allows you to use Jupyter Notebooks to write, run, and debug Python code</li></ul><ul><li>online environment that allows you to run your code in the cloud</li><li>part of open source project — <a href="https://jupyter.org">Project Jupyter</a> </li><li>free to use</li></ul><pre class="language-bash"><code class="lang-bash"># Install JupyterLab
pip install jupyterlab

# Once installed, launch JupyterLab
jupyter-lab
</code></pre></td></tr><tr><td><strong><code>Jupyter Notebook</code></strong></td><td><ul><li>write, run, and debug Python code on web-based interface through JupyterLab or on your local machine</li><li>live code blocks</li><li>you can see your input and output all in one spot</li><li>part of open source project — <a href="https://jupyter.org">Project Jupyter</a></li><li>free to use</li><li>Notebooks can be shared and saved easily using email, GitHub, and <a href="https://nbviewer.org/">Jupyter Notebook Viewer</a>. </li></ul><pre class="language-bash"><code class="lang-bash"># Install the classic Jupyter Notebook
pip install notebook

# Run the notebook
jupyter notebook
</code></pre></td></tr><tr><td><strong><code>CoLab</code></strong></td><td><ul><li>Jupyter Notebooks that are hosted by Google’s Colaboratory<strong>.</strong></li><li>Web-based platform that allows you to write and run Python code really quickly in Google Drive. </li><li>It is free and ready to use with zero configuration required.</li><li>Can include markdown in your notebooks</li><li>Can install Python packages using the pip command within the code cell.</li></ul><pre class="language-bash"><code class="lang-bash"># to install a Python library use the pip command with an exclamation point
!pip install &#x3C;library name>
</code></pre></td></tr><tr><td><strong>-------------------</strong></td><td><p><strong>IDEs (Integrated Development Environments)</strong></p><ul><li>A software tool/application that provides comprehensive facilities for software development; brings multiple tools into one environment; you can edit, build, test and package software in one application. </li><li>IDEs always include a Code Editor. </li></ul></td></tr><tr><td><strong><code>IDLE</code></strong></td><td><p>The IDE that comes with Python distribution.</p><ul><li>an interactive interpreter or file editor</li><li>a beginner-level IDE</li><li>not great for larger projects</li></ul></td></tr><tr><td><strong><code>PyCharm</code></strong></td><td><ul><li>Open source Python IDE.</li></ul><ul><li>Features: intelligent code editing, code completion, error detection, on-the-fly fixes, code navigation, code search, structure diagrams.</li></ul><ul><li>Built-in debugger: breakpoints, step-by-step execution, variable inspection.</li></ul><ul><li>Integrated code testing.</li></ul><ul><li>Large plugin ecosystem and community support.</li></ul><ul><li>Easy to use, highly customizable, suitable for beginners and professionals.</li></ul></td></tr><tr><td><strong><code>PyDev</code></strong></td><td><ul><li>Open source Python IDE based on Eclipse.</li></ul><ul><li>Features: intelligent code editor, code navigation, debugging, testing, refactoring.</li></ul><ul><li>Powerful refactoring engine for improving code structure.</li></ul><ul><li>Full Eclipse integration (project explorer, perspectives, debugger).</li></ul><ul><li>Free, compatible with many Python versions, extensible with plugins.</li></ul><ul><li>Large user/developer community with abundant resources.</li></ul></td></tr><tr><td><strong><code>Notepad++</code></strong></td><td><ul><li>Open source text editor for Windows.</li></ul><ul><li>Supports many languages including Python.</li></ul><ul><li>Features: multi-file tabs, syntax highlighting, auto-completion, file management.</li></ul><ul><li>Syntax highlighting helps track code structure and identify errors.</li></ul><ul><li>Active, collaborative community support.</li></ul></td></tr><tr><td><strong>-------------------</strong></td><td><p><strong>AI Code Assistants</strong></p><ul><li>AI-powered tools integrated into IDEs like VS Code and JetBrains.</li></ul><ul><li>Provide context-aware coding help: error analysis, suggestions, conversational answers.</li></ul><ul><li>Accelerate coding workflows, but outputs require review for accuracy and security.</li></ul><ul><li>Treat AI as a helpful co-pilot and validate all outputs before use.</li></ul></td></tr><tr><td></td><td> <code>Gemini Code Assist | Github Copilot</code></td></tr></tbody></table>







