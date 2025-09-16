"""Flask app with a simple hello-world functionality"""
from flask import Flask

app = Flask(__name__)

@app.route("/hello")
def hello_world():
    """Function printing anonymous greeting"""
    return "<p>Hello, stranger!</p>"

@app.route("/hello/<string:name>")
def hello_name(name):
    """Function printing personalized greeting"""
    return f"<p>Hello, {name}!</p>"
