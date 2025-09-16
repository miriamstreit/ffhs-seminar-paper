import pytest
from app.hello import app

@pytest.fixture()
def client():
    return app.test_client()

def test_hello_world(client):
    response = client.get("/hello")
    assert response.data == b"<p>Hello, stranger!</p>"

def test_hello_name(client):
    response = client.get("/hello/World")
    assert response.data == b"<p>Hello, World!</p>"